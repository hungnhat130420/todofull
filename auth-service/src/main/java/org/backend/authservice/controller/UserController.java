package org.backend.authservice.controller;

import org.backend.authservice.model.User;
import org.backend.authservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user) {
        return this.userRepository.save(user);
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return this.userRepository.findAll();
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUserByID(@PathVariable String id) {
        User user = this.userRepository.findById(id).orElse(null);
        if (user == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(user);
    }
}
