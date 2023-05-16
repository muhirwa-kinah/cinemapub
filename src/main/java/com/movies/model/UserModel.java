package com.movies.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class UserModel {
    @Id

    private Integer userId;
    private String role;
    private String name;
    private String phone;
    private String email;
    private String password;
    private boolean loggedIn;

    public UserModel(){

    }
    public  UserModel(Integer userId, String role, String name,String phone,String email, String password, Boolean loggedIn) {
        this.userId=userId;
        this.role=role;
        this.name=name;
        this.phone=phone;
        this.email=email;
        this.password=password;
        this.loggedIn=loggedIn;
    } 



    public void setUserId(Integer userId){
        this.userId=userId;
    }
    public Integer getUserId(){
        return userId;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setRole(String role){
        this.role=role;
    }
    public String getRole(){
        return role;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
    public String getPhone(){
        return phone;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return email;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getPassword(){
        return password;
    
    }
    public boolean isLoggedIn() {
        return loggedIn;
    }
    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserModel)) return false;
        UserModel user = (UserModel) o;
        return Objects.equals(email, user.email) &&
                Objects.equals(password, user.password);

    }
}

//
//const express = require('express');
//        const bcrypt = require('bcrypt');
//        const app = express();
//        const PORT = 8080;
//
//// Middleware
//        app.use(express.json());
//
//// Route to handle signup
//        app.post('/api/signup', (req, res) => {
//        const { userId, role, name, email, phone, password } = req.body;
//
//        // Hash the password
//        bcrypt.hash(password, 10, (err, hash) => {
//        if (err) {
//        console.error('Error:', err);
//        return res.status(500).json({ error: 'Internal server error' });
//        }
//
//        // Store the hashed password in the database or perform any other desired actions
//        const user = {
//        userId,
//        role,
//        name,
//        email,
//        phone,
//        password: hash, // Store the hashed password
//        };
//
//        // Return success response
//        res.status(200).json({ message: 'User signed up successfully' });
//        });
//        });
//
//// Start the server
//        app.listen(PORT, () => {
//        console.log(`Server listening on port ${PORT}`);
//        });
