package com.example.swagger.controllers;


import com.example.swagger.models.User;
import com.example.swagger.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloWorldController {

    private UserRepository userRepository;

    @Autowired
    public HelloWorldController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping(path = "/user",method = RequestMethod.GET)
    public List<User> getUser(){

        return (List<User>) userRepository.findAll();
    }
}
