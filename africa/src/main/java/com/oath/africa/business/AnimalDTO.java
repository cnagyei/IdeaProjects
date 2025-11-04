package com.oath.africa.business;

public class AnimalDTO {
    private int id;
    private String name;
    private Integer age;
    private String habitat;

    // Constructor
    public AnimalDTO() {}


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

    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}

