package com;

import java.util.Date;

public class Password {
    private String password;
    private Date dateUpdatePassword;

    Password(String password){
        setPassword(password);
    }

    public void setPassword(String password){
        this.password = password;
        dateUpdatePassword = new Date();
    }
    public String getPassword(){
        return password;
    }
}
