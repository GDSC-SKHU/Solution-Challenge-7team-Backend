package com.example.barcode.service;

import com.example.barcode.domain.User;
import com.example.barcode.domain.dto.UserDto;

public interface UserService {
    void save(UserDto userDto);

}
