package com.project.manager.controllers;

import com.project.manager.requests.UserDto;
import com.project.manager.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping
    public ResponseEntity<UserDto> save(@RequestBody UserDto user){
        return userService.save(user);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> findById(@PathVariable(value = "id") Integer id){
        return ResponseEntity.ok(userService.findUser(id));
    }
}
