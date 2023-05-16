package com.movies.services;

import java.util.List;

import com.movies.model.UserModel;

public interface UserService {
    
    public String signup(UserModel user);

    public List<UserModel> findAll();

    public void save(UserModel user);
    public UserModel getUser(String email, String password);

}
