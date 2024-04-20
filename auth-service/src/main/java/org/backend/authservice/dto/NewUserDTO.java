package org.backend.authservice.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class NewUserDTO {

    String username;
    String password;
    String email;
    String providerId;
    String firstName;
    String lastName;
    String phoneNumber;
    LocalDate dob;
    LocalDate createdAt;
    LocalDate updatedAt;

}
