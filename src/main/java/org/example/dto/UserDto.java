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

}
