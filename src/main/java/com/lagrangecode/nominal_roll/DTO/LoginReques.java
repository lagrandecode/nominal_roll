package com.lagrangecode.nominal_roll.DTO;


import lombok.Data;

@Data
public class LoginReques {
    private String email;
    private String password;

    public LoginReques(String email, String password){
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
