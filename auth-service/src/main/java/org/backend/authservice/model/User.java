package org.backend.authservice.model;


import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Document(collection = "users")
public class User {
    @Id
    String id;
    String username;
    String password;
    String email;
    String providerId;
    String provider;
    String firstName;
    String lastName;
    String phoneNumber;
    LocalDate dob;
    Set<String> sharedTodos;
    LocalDate createdAt;
    LocalDate updatedAt;
}
