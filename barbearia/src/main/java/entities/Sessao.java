/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author lucas
 */
public class Sessao {
    private static Sessao instance;
    public Long idUsuario;
    public User user;
    public int id_corte;
    public String nome_corte;

    private Sessao(){
    }
    
    public static Sessao getInstance(){
        if (instance == null){
            instance = new Sessao();
        }
        
        return instance;
    }
}
