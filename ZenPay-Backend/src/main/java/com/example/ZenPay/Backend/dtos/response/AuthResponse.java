package com.example.ZenPay.Backend.dtos.response;

import com.example.ZenPay.Backend.controllers.AuthController;

public class AuthResponse {

    public String token;


    public AuthResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    
}
