package org.example.dto;

import java.time.LocalDate;

public record UserDto(
        Long id,
        String firstName,
        String lastName,
        String identificationDocument,
        String nationality,
        LocalDate registrationDate,
        LocalDate expirationDate
){
    public UserDto {
        if (firstName == null || firstName.isBlank()) {
            throw new IllegalArgumentException("First name is required");
        }
        if (lastName == null || lastName.isBlank()) {
            throw new IllegalArgumentException("Last name is required");
        }
        if (identificationDocument == null || identificationDocument.isBlank()) {
            throw new IllegalArgumentException("Identification document is required");
        }
        if (nationality == null || nationality.isBlank()) {
            throw new IllegalArgumentException("nationality is required");
        }
        if (registrationDate == null) {
            throw new IllegalArgumentException("Registration date is required");
        }
        if (expirationDate == null) {
            throw new IllegalArgumentException("Expiration date is required");
        }
        if (id != null && id < 0) {
            throw new IllegalArgumentException("Id must be greater than zero");
        }
    }
}
