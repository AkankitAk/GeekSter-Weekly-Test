package com.weeklyTest.ecommerceapi.controller;

import com.weeklyTest.ecommerceapi.model.User;
import com.weeklyTest.ecommerceapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping(value = "/user")
    public String saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping(value = "get-by-id")
    public User getUser(@RequestParam Integer userId){
        return userService.getUserById(userId);
    }
}
