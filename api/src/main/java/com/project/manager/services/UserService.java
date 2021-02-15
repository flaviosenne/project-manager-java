package com.project.manager.services;

import com.project.manager.domain.User;
import com.project.manager.repositories.UserRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class UserService {


    private final UserRepository userRepository;


    public List<User> getAllUsers(){
        return this.userRepository.findAll();
    }

}
