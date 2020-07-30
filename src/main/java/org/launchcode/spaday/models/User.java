package org.launchcode.spaday.models;

import java.util.Date;

public class User {
    private int id;
    private static int nextId = 1;
    private String username;
    private String email;
    private String password;
    private java.util.Date date= new Date();
    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.id = nextId;
        nextId++;
        //this.Date = Date;
    }
    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        date = date;
    }
}
