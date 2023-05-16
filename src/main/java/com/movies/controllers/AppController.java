package com.movies.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.movies.model.UserModel;
import com.movies.services.UserService;


@Controller

public class AppController {





    //open index page
    @GetMapping("/index")
    public String homePage()

    {
        return "index";
    }


    @GetMapping("/signup")
    public String signUp(){
        return"signup";
    }

    @GetMapping("/login")
    public String login(){

        return "login";
    }

    @GetMapping("/movieList")
    public String movieList(){
        return "movieList";
    }

    @GetMapping("/movieListClient")
    public String movieListClient(){

        return "movieListClient";
    }


    }


