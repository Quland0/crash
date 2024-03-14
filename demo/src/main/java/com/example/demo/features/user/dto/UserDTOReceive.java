package com.example.demo.features.user.dto;

public class UserDTOReceive {
    String email;
    String password;

    public UserDTOReceive(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
