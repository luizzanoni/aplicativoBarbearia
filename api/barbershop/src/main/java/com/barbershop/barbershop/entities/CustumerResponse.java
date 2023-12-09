package com.barbershop.barbershop.entities;

public class CustumerResponse<T> {
    private String message;
    private int status;
    private T entity;

    public CustumerResponse(String message, int status){
        this.message = message;
        this.status = status;
    }

    public CustumerResponse(String message, int status, T entity){
        this.message = message;
        this.status = status;
        this.entity = entity;
    }

    public String getMessage() {
        return message;
    }

    public int getStatus() {
        return status;
    }

    public T getEntity(){
        return entity;
    }
}
