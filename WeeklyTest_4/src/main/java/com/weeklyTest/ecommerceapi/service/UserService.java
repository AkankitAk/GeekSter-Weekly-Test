package com.weeklyTest.ecommerceapi.service;

import com.weeklyTest.ecommerceapi.dao.UserRepo;
import com.weeklyTest.ecommerceapi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;
    public String saveUser(User user) {
        userRepo.save(user);
        return "save user";
    }

    public User getUserById(Integer userId) {
        return userRepo.getById(userId);
    }
}
