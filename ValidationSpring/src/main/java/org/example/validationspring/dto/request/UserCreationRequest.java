package org.example.validationspring.dto.request;

import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserCreationRequest {
    String username;
    @Size(min = 8, message = "PASSWORD_INVALID")
    String password;
    String firstName;
    String lastName;
    LocalDate dob;

}
