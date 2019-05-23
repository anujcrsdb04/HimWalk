package com.example.himwalk;
/**
 * Created by Anuj Sharma on 24/05/19.
 */
public class User {
    public String id;
    public String username;
    public String email;
    public String password;

    public User(String id, String userName, String email, String password) {
        this.id = id;
        this.username = userName;
        this.email = email;
        this.password = password;
    }

    public User() {

    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }



}