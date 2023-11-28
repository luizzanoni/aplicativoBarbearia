package com.barbershop.barbershop.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    public String name_table = new String("user");
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;
    String login;
    String password;
    Integer is_barber;

    public String createTable() {
        String sql = new String(
            "CREATE TABLE IF NOT EXISTS user(" + 
                "name TEXT)"
        );

        return sql;
    }
}

