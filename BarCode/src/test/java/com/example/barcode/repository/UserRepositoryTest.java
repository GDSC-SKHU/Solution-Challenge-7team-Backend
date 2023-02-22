package com.example.barcode.repository;

import com.example.barcode.domain.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.slf4j.MDC.clear;

@SpringBootTest
@Transactional
class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;
    @Autowired
    EntityManager em;

    @AfterEach
    private void after(){
        em.clear();
    }

    @Test
    public void 회원저장_성공() throws Exception {
        //given
        User user = User.builder().username("username").password("1234567890").nickname("nickname1").date("수").build();

        //when
        User saveMember = userRepository.save(user);

        //then
        User findMember = userRepository.findById(saveMember.getId()).orElseThrow(() -> new RuntimeException("저장된 회원이 없습니다"));

        assertThat(findMember).isSameAs(saveMember);
        assertThat(findMember).isSameAs(user);
    }

    @Test
    public void 오류_회원가입시_아이디가_없음() throws Exception {
        //given
        User user = User.builder().password("1234567890").nickname("nickname1").date("수").build();

        //when, then
        assertThrows(Exception.class, () -> userRepository.save(user));
    }

    @Test
    public void 오류_회원가입시_닉네임이_없음() throws Exception {
        //given
        User user = User.builder().username("username").password("1234567890").date("수").build();

        //when, then
        assertThrows(Exception.class, () -> userRepository.save(user));
    }

    @Test
    public void 오류_회원가입시_중복된_아이디가_있음() throws Exception {
        //given
        User member1 = User.builder().username("username").password("1234567890").nickname("Member1").date("화").build();
        User member2 = User.builder().username("username").password("1111111111").nickname("NickName2").date("목").build();


        userRepository.save(member1);
        clear();

        //when, then
        assertThrows(Exception.class, () -> userRepository.save(member2));

    }


}
