package com.project.manager.services;

import com.project.manager.domain.User;
import com.project.manager.repositories.UserRepository;
import com.project.manager.requests.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public ResponseEntity<UserDto> save(UserDto userDto){
        User userSaved = userRepository.save(new UserDto().fromDomain(userDto));

        return ResponseEntity.status(201).body(new UserDto().fromDto(userSaved));
    }
}
