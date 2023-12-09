package com.barbershop.barbershop.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.barbershop.barbershop.entities.CustumerResponse;
import com.barbershop.barbershop.entities.User;
import com.barbershop.barbershop.services.UserService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class UserController {
    UserService userService;

    @PostMapping("/signup")
    public CustumerResponse<User> createUser(@RequestBody User user){
        CustumerResponse<User> custumerResponse;

        try{
            System.out.println(user);
            Boolean isUsuarioCriado = userService.createUser(user);
            if (isUsuarioCriado){
                String message = "Usuário criado com sucesso";
                custumerResponse = new CustumerResponse<User>(message, 200);
            }  else {
                custumerResponse = new CustumerResponse<User>("Usuário inválido", 401);
            }
            
        }catch (Exception exc){
            String message = exc.getMessage();
            custumerResponse = new CustumerResponse<User>(message, 401);
        }

        return custumerResponse;
    }

    @PostMapping("/signin")
    public CustumerResponse<User> loginUser(@RequestBody User user){
        CustumerResponse<User> custumerResponse;

        try{
            System.out.println(user);
            User userDB = userService.loginUser(user);
            if (userDB != null){
                String message = "Login efetuado com sucesso.";
                custumerResponse = new CustumerResponse<User>(message, 200, userDB);
            } else {
                custumerResponse = new CustumerResponse<User>("Internal Error", 404);
            }
            
        }catch (Exception exc){
            String message = exc.getMessage();
            custumerResponse = new CustumerResponse<User>(message, 401);
        }

        return custumerResponse;
    }
}
