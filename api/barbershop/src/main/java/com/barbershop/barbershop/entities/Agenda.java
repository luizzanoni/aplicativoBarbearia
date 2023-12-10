package com.barbershop.barbershop.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "agenda")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Agenda {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    Long id;

    @Column(name = "id_user")
    Long id_user;

    @Column(name = "nome_user")
    String nome_user;

    @Column(name = "id_corte")
    Long id_corte;

    @Column(name = "nome_corte")
    String nome_corte;
    
    @Column(name = "data_corte")
    String data_corte;
}