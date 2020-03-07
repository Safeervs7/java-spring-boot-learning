package com.learning.springdemo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserResource {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List allUsers(){
        return userService.findAll();
    }

    @PostMapping("/users")
    public  String createUser(User user){
        userService.addUser(user);
        return "success";
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable int id){
        return userService.findOne(id);
    }

}
