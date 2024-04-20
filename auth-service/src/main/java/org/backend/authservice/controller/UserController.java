package org.backend.authservice.controller;

import org.backend.authservice.dto.NewUserDTO;
import org.backend.authservice.model.User;
import org.backend.authservice.repository.UserRepository;
import org.backend.authservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/addUser")
    public User addUser(@RequestBody NewUserDTO userDTO) {
        return this.userService.createUser(userDTO);
    }

//    @GetMapping("/users")
//    public List<User> getUsers() {
//        return this.userRepository.findAll();
//    }
//
//    @GetMapping("/user/{id}")
//    public ResponseEntity<User> getUserByID(@PathVariable String id) {
//        User user = this.userRepository.findById(id).orElse(null);
//        if (user == null) {
//            return ResponseEntity.notFound().build();
//        }
//        return ResponseEntity.ok(user);
//    }
}
