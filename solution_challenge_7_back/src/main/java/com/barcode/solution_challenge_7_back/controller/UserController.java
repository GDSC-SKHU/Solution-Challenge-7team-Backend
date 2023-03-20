package com.barcode.solution_challenge_7_back.controller;

import com.barcode.solution_challenge_7_back.domain.dto.UserDto;
import com.barcode.solution_challenge_7_back.domain.request.LoginRequest;
import com.barcode.solution_challenge_7_back.exception.UserPasswordMismatchException;
import com.barcode.solution_challenge_7_back.repository.UserRepository;
import com.barcode.solution_challenge_7_back.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    private final UserRepository userRepository;

    @PostMapping("/users/new-user") // 회원가입
    public ResponseEntity<String> join(@RequestBody UserDto userDto) throws UserPasswordMismatchException {
        if(!userDto.getPassword().equals(userDto.getCheckpassword())){
            throw new UserPasswordMismatchException("패스워드가 일치하지 않습니다.");
        }
        userService.save(userDto);
        return ResponseEntity.ok("join success");
    }

    @PostMapping("/login") // 로그인
    public ResponseEntity<Boolean> login(@RequestBody LoginRequest request) {
        boolean isAuthenticated = userService.checkLogin(request.getId(), request.getPassword());
        return isAuthenticated ? ResponseEntity.ok(true) : ResponseEntity.badRequest().body(false);
    }

    @GetMapping("/checkDuplicateId/{id}") // 아이디 중복 확인
    public boolean checkDuplicateId(String id) {
        return userService.checkDuplicateId(id);
    } // 중복이면 true, 중복 아니면 false

    @GetMapping("/checkDuplicateNickname/{nickname}")
    public boolean checkDuplicateNickname(String nickname){
        return userService.checkDuplicateNickname(nickname);
    }

}