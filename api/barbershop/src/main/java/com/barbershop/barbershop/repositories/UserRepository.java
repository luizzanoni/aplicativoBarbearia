package com.barbershop.barbershop.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.barbershop.barbershop.entities.User;


public interface UserRepository extends JpaRepository<User, Integer> {
    User findByLogin(String login);

    @Query(value = "SELECT * FROM user WHERE login=?1 and password=?2", nativeQuery = true)
    User findUserByLogin(String login, String password);
}
