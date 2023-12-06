package com.barbershop.barbershop.controllers;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.barbershop.barbershop.entities.User;
import com.barbershop.barbershop.repositories.UserRepository;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class UserController {
    UserRepository userRepository;

    @GetMapping("/info")
    public String info(){
        return "The application is up...";
    }

    @GetMapping("/user")
    public List<User> getAllUsers(){
        return userRepository.findAll();

    }
}
