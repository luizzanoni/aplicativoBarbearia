package com.barbershop.barbershop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.barbershop.barbershop.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {
    User findByLogin(String login);

    @Query(value = "SELECT * FROM user WHERE login=?1 and password=?2", nativeQuery = true)
    User findUserByLogin(String login, String password);
}
