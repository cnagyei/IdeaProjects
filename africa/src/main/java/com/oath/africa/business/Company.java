package com.oath.africa.business;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private LocalDate accountCreatedAt;
    private LocalTime timeCreatedAt;

    // Constructors
    public Company() {}

    public Company(int id, String name, String email, LocalDate accountCreatedAt, LocalTime timeCreatedAt) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.accountCreatedAt = accountCreatedAt;
        this.timeCreatedAt = timeCreatedAt;
    }

    public Company(String name, String email, LocalDate accountCreatedAt) {
        this.name = name;
        this.email = email;
        this.accountCreatedAt = accountCreatedAt;
    }

    public Company(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters and setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getAccountCreatedAt() {
        return accountCreatedAt;
    }
    public void setAccountCreatedAt(LocalDate accountCreatedAt) {
        this.accountCreatedAt = accountCreatedAt;
    }

    public LocalTime getTimeCreatedAt() {
        return timeCreatedAt;
    }
    public void setTimeCreatedAt(LocalTime timeCreatedAt) {
        this.timeCreatedAt = timeCreatedAt;
    }
}
