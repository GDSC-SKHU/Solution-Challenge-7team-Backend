package com.example.barcode.domain.dto;

import com.example.barcode.domain.User;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDto {

    private String username;
    private String password;
    private String nickname;
    private String date;

    public User toEntity(){
        return User.builder().password(password).username(username)
                .nickname(nickname).date(date).build();
    }
}
