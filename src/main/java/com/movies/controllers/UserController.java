package com.movies.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.movies.model.UserModel;
import com.movies.services.UserService;


@RestController
@RequestMapping("/api/")
@CrossOrigin
public class UserController {
    UserService userService;
    public UserController(UserService userService){
        this.userService=userService;
    }







    @PostMapping("signup")
    public String signup(@RequestBody UserModel user ) {
        userService.signup(user);
        return "Success";  
    }
    // @PostMapping("signin")
    // public Status loginUser(@RequestBody UserModel user) {
    //     List<UserModel> users = userService.findAll();
    //     for (UserModel other : users) {
    //         if (other.equals(user)) {
    //             user.setLoggedIn(true);
               
    //             return Status.SUCCESS;
    //         }
    //     }
    //     return Status.FAILURE;
    // }
    @PostMapping("signin")
    public UserModel loginUser(@RequestBody PostBody postBody) {
        return userService.getUser(postBody.email,postBody.password);  
    }
}

