package com.example.barcode.controller;

import com.example.barcode.domain.request.UserRequest;
import com.example.barcode.domain.dto.UserDto;
import com.example.barcode.repository.UserRepository;
import com.example.barcode.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/users/new-user")
    public ResponseEntity<String> join(@RequestBody UserDto userDto) {
        userService.save(userDto);
        return ResponseEntity.ok("join success");
    }


    @PostMapping("/users/login")
    public ResponseEntity login(@RequestBody UserRequest request) {
        if (userService.login(request.getId(),
                request.getPassword()).equals("Success")) {
            return new ResponseEntity(HttpStatus.OK );
        }
        return new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

}