package org.backend.authservice.controller;

import org.backend.authservice.model.User;
import org.backend.authservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user) {
        return this.userRepository.save(user);
    }
}
