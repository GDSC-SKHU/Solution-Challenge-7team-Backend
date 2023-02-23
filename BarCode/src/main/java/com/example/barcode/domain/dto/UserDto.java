package com.example.barcode.domain.dto;

import com.example.barcode.domain.User;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDto {

    private String id; // 유저 아이디
    private String password; // 유저 비밀번호
    private String nickname; // 유저 닉네임
    private String date; // 쓰레기 버리는 날

    public User toEntity(){
        return User.builder().id(id).password(password)
                .nickname(nickname).date(date).build();
    }
}