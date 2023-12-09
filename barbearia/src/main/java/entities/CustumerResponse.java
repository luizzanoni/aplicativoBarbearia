/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author lucas
 */
public class CustumerResponse<T> {
    private String message;
    private int status;
    private T entity;
    
    public CustumerResponse(){
    }
    
    public CustumerResponse(String message, int status){
        this.message = message;
        this.status = status;
    }

    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message){
        this.message = message;
    }

    public int getStatus() {
        return status;
    }
    
    public void setStatus(Integer status){
        this.status = status;
    }
    
    public T getEntity() {
        return entity;
    }
    
    public void setEntity(T entity){
        this.entity = entity;
    }
}
