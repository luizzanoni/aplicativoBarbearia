package com.barbershop.barbershop.entities;

public class CustumerResponse {
    private String message;
    private int status;

    public CustumerResponse(String message, int status){
        this.message = message;
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public int getStatus() {
        return status;
    }
}
