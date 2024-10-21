package com.example.user_service;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private List<User> users;
    
    @GetMapping("/")
    public List<User> getUsers(){
        return users;
    }
    
    @PostMapping("/")
    public User createUser(@RequestBody User user){
        users.add(user);
        return user;
    }
}
