package org.example.dto;

import java.time.LocalDate;

public class UserDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String identificationNumber;
    private String nationality;
    private LocalDate registrationDate;
    private LocalDate expirationDate;


    public UserDTO() {
    }

    public UserDTO(Long id, String firstName, String lastName, String identificationNumber, String nationality, LocalDate registrationDate, LocalDate expirationDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.identificationNumber = identificationNumber;
        this.nationality = nationality;
        this.registrationDate = registrationDate;
        this.expirationDate = expirationDate;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }
}
