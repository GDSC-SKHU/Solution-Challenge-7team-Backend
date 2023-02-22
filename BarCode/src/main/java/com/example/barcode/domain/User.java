package com.example.barcode.domain;

import lombok.*;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name="User")
@AllArgsConstructor
@Builder
public class User extends BaseTimeEntity {

    @Id // Pk
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int id; // 유저 아이디

    @Column(name="user_name")
    private String username; // 아이디

    @Column(name = "user_pw", unique = true)
    private String password; // 비밀번호

    @Column(name = "user_nickname", unique = true, length = 20)
    private String nickname; // 닉네임

    private String date; // 분리수거 버리는 날 지정

    public void updateNickname(String nickname){ // 닉네임 변경 가능
        this.nickname = nickname;
    }

    public void updatePassword(PasswordEncoder passwordEncoder, String password){ // 비밀번호 변경 가능
        this.password = passwordEncoder.encode(password);
    }

    //== 패스워드 암호화 ==//
    public void encodePassword(PasswordEncoder passwordEncoder){
        this.password = passwordEncoder.encode(password);
    }

}
