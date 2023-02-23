package com.example.barcode.service;

import com.example.barcode.domain.dto.UserDto;

public interface UserService {

    void save(UserDto userDto); // 회원가입

    String login(String id, String password); // 로그인

}
