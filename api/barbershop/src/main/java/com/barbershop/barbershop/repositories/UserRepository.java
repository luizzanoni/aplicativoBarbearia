package com.barbershop.barbershop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barbershop.barbershop.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
