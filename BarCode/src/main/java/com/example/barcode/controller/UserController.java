package com.example.barcode.controller;

import com.example.barcode.domain.dto.UserDto;
import com.example.barcode.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/users/new-user")
    public ResponseEntity<String> join(@RequestBody UserDto userDto) {
        userService.save(userDto);
        return ResponseEntity.ok("join success");
    }


//    @PostMapping("/login")
//    public UserDTO login(@RequestBody UserDTO user) {
//        System.out.println("Login attmpted :: " + user);
//
//        UserDTO userDTO = this.userService.findUserByUsername(user.getUsername());
//        return userDTO;
//    }


}
