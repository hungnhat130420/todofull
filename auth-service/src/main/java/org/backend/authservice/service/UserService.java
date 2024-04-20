package org.backend.authservice.service;

import org.backend.authservice.dto.NewUserDTO;
import org.backend.authservice.model.User;
import org.backend.authservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(NewUserDTO newUserDTO) {
        User user = User.builder()
                .username(newUserDTO.getUsername())
                .password(newUserDTO.getPassword())
                .email(newUserDTO.getEmail())
                .firstName(newUserDTO.getFirstName())
                .lastName(newUserDTO.getLastName())
                .phoneNumber(newUserDTO.getPhoneNumber())
                .dob(newUserDTO.getDob())
                .createdAt(LocalDate.now())
                .updatedAt(newUserDTO.getUpdatedAt())
                .build();
        return userRepository.save(user);
    }

}
