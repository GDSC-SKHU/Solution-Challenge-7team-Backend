package com.example.barcode.service;

import com.example.barcode.domain.dto.UserDto;

public interface UserService {
    void save(UserDto userDto);

    String login(String id, String password);

}
