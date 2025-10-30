package com.calbert.demo.model.entity;

import jakarta.validation.constraints.*;

import java.util.List;

public class SpecialAgent {

    @NotNull(message = "name cannot be null") // Cannot be null
    private String name;

    @NotEmpty(message = "surname cannot be empty") // Least is to be " ", cannot be null
    private String surname;

    @NotBlank(message = "Code cannot be blank") // Cannot have 0 characters when trimmed, cannot be null
    @Pattern(regexp = "[0-9]{1,3}") // Can contain from 1 to 3 digits only
    private String code;

    @Size(min = 1, max = 10, message = "Size must be at least 1 and at most 10")
    private String status;

    @Min(value = 18, message = "Age must be greater than or equal to 18")
    @Max(value = 60, message = "Age must be less than or equal to 60")
    private int age;

    private List<String> cars;

    @Email(message = "email must be a valid email like name@example.com")
    @NotNull(message = "email cannot be null")
    private String email;

    // Constructor
    public SpecialAgent() {}

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getCars() {
        return cars;
    }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
    public void setCars(List<String> cars) {
        this.cars = cars;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
