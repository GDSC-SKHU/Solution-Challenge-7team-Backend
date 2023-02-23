package com.example.barcode.service;
import com.example.barcode.domain.User;
import com.example.barcode.domain.dto.UserDto;
import com.example.barcode.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    @Override
    public void save(UserDto userDto){

        userRepository.save(userDto.toEntity());
    }

    @Override
    public String login(String id, String password){
        Optional<User> user = userRepository.findById(id);
        if(user.get().getPassword().equals(password)){
            return "Success";
        }
        return "Failed";
    }

}