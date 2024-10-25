package org.example.dto;

import java.time.LocalDate;

public record UserDTO (
    Long id,
    String firstName,
    String lastName,
    String identificationNumber,
    String nationality,
    LocalDate registrationDate,
    LocalDate expirationDate

){
}
