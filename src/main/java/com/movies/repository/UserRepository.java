package com.movies.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.movies.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, String> {

    UserModel findByEmailAndPassword(String email, String password);
  
}
