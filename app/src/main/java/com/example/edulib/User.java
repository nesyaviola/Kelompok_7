package com.example.edulib;

import java.util.Date;

public class User {
    String username;
    String first_name;
    Date sessionExpiryDate;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setFullName(String first_name) {
        this.first_name = first_name;
    }

    public void setSessionExpiryDate(Date sessionExpiryDate) {
        this.sessionExpiryDate = sessionExpiryDate;
    }

    public String getUsername() {
        return username;
    }

    public String getFullName() {
        return first_name;
    }

    public Date getSessionExpiryDate() {
        return sessionExpiryDate;
    }
}
