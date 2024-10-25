package org.example.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    private String identificationDocument;

    private String nationality;

    private LocalDate registrationDate;

    private LocalDate expirationDate;

    public User() {
    }

    public User(String firstName, String lastName, String identificationDocument, String nationality, LocalDate registrationDate, LocalDate expirationDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.identificationDocument = identificationDocument;
        this.nationality = nationality;
        this.registrationDate = registrationDate;
        this.expirationDate = expirationDate;
    }

    public User(Long id, String firstName, String lastName, String identificationDocument, String nationality, LocalDate registrationDate, LocalDate expirationDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.identificationDocument = identificationDocument;
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

    public String getIdentificationDocument() {
        return identificationDocument;
    }

    public void setIdentificationDocument(String identificationDocument) {
        this.identificationDocument = identificationDocument;
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
