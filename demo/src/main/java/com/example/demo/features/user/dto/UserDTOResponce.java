package com.example.demo.features.user.dto;

import java.util.Date;

public class UserDTOResponce {
    Integer id_user;
    String login;
    String email;
    String password;
    Date create_data;
    Float balance;


    public UserDTOResponce(int id_user, String login, String email, String password, Date create_data, float balance) {
        this.id_user = id_user;
        this.login = login;
        this.email = email;
        this.password = password;
        this.create_data = create_data;
        this.balance = balance;
    }

    public Integer getId_user() {
        return id_user;
    }

    public String getLogin() {
        return login;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public Date getCreate_data() {
        return create_data;
    }
    public Float getBalance() {
        return balance;
    }
}
