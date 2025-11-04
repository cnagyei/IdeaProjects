package com.oath.africa.presentation;

import com.oath.africa.business.User;
import com.oath.africa.business.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/user")
    public User saveUser(@RequestBody User user) {
        User createdUser = userService.save(new User(
                user.getId(),
                user.getUsername(),
                user.getFirstName(),
                user.getLastName())
        );

        return createdUser;
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.findUserById(id);
    }
}
