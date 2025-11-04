package com.oath.africa.business;

import jakarta.persistence.*;

@Entity
@Table(name = "animal")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String  name;

    @Column(name = "habitat")
    private String  habitat;

    @Column(name = "age")
    private int  age;

    // Constructors
    public Animal() {}

    public Animal(int id, String name, String habitat, int age) {
        this.id = id;
        this.name = name;
        this.habitat = habitat;
        this.age = age;
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

    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
