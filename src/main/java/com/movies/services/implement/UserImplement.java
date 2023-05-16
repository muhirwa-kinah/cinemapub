package com.movies.services.implement;

import java.util.List;
import java.util.Objects;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import com.movies.model.UserModel;
import com.movies.repository.UserRepository;
import com.movies.services.UserService;
@Service
public class UserImplement implements UserService{

    UserRepository userRepository;
    public  UserImplement(UserRepository userRepository) {
        this.userRepository=userRepository;
   } 

    @Override
    public String signup(UserModel user) {
        userRepository.save(user);
        return "Account Created Successfully";
    }

    @Override
    public List<UserModel> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void save(UserModel user) {
        userRepository.save(user);
    }

    @Transactional
    @Override
    public UserModel getUser(String email, String password){
        return userRepository.findByEmailAndPassword(email,password);
    }
    
    
}
