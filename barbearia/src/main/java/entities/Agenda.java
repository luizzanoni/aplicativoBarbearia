/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author lucas
 */
public class Agenda {
    Long id;
    Long id_user;
    int id_corte;
    String nome_user;
    String nome_corte;
    String data_corte;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId_user() {
        return id_user;
    }

    public void setId_user(Long id_user) {
        this.id_user = id_user;
    }

    public int getId_corte() {
        return id_corte;
    }

    public void setId_corte(int id_corte) {
        this.id_corte = id_corte;
    }
    
    public String getNome_user() {
        return nome_user;
    }

    public void setNome_user(String nome_user) {
        this.nome_user = nome_user;
    }

    public String getNome_corte() {
        return nome_corte;
    }

    public void setNome_corte(String nome_corte) {
        this.nome_corte = nome_corte;
    }

    public String getData_corte() {
        return data_corte;
    }

    public void setData_corte(String data_corte) {
        this.data_corte = data_corte;
    } 
}
