package com.barbershop.barbershop.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.barbershop.barbershop.repositories.UserRepository;
import com.barbershop.barbershop.entities.User;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class UserController {

    @GetMapping("/user")
    public List<User> getAllCartoes(){
        User user = new User();

        return 
    }
}
