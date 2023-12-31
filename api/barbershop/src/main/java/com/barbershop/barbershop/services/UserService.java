package com.barbershop.barbershop.services;

import org.springframework.stereotype.Service;

import com.barbershop.barbershop.entities.User;
import com.barbershop.barbershop.repositories.UserRepository;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Boolean createUser(User user) throws Exception{
        User userDB = this.userRepository.findByLogin(user.getLogin());
        if(userDB == null){
            if(user.getName() == null){
                throw new Exception("Não é possível criar usuários sem nome.");
            }
            else if (user.getPassword() == null || user.getPassword().equals("")){
                throw new Exception("Não é possível criar uma senha em branco.");
            }else {
                userRepository.save(user);
                return true;
            }
            
        }else{
            throw new Exception("Já existe um usuário com esse login.");
        }
    }

    public User loginUser(User user) throws Exception{
        User userDB;
        try {
            userDB = this.userRepository.findUserByLogin(user.getLogin(), user.getPassword());
        }catch(Exception exc){
            throw new Exception("usuário ou senha inválido.");
        }

        return userDB;
    }
}
