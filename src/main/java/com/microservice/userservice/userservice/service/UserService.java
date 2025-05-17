package com.microservice.userservice.userservice.service;

import com.microservice.userservice.userservice.dto.UserDto;
import com.microservice.userservice.userservice.entity.User;
import com.microservice.userservice.userservice.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
     private final UserRepository userRepository;
     public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
     }

     public User saveUser(UserDto user) {
         User userEntity = new User();
         userEntity.setName(user.getName());
         userEntity.setEmail(user.getEmail());
         return userRepository.save(userEntity);
     }
}

