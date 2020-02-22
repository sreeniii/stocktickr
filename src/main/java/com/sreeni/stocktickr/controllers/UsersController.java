package com.sreeni.stocktickr.controllers;


import com.sreeni.stocktickr.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsersController {
    @GetMapping ("/api/users/{userId}")
    public User getUserByUserId(@PathVariable int userId) {
        User user = new User();
        user.setUserId(userId);
        user.setGender('M');
        user.setName("Smo Name");
        return user;
    }

    @GetMapping ("/api/users/")
    public List<User> getUserList() {
        List<User> users = new ArrayList<>();
        User user = new User();
        user.setUserId(1234);
        user.setGender('F');
        user.setName("qwerty");

        User user2 = new User();
        user2.setUserId(5678);
        user2.setGender('F');
        user2.setName("asdfg");

        users.add(user);
        users.add(user2);

        return users;

    }

}
