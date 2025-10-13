package com.calbert.demo.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.data.repository.CrudRepository;

@Entity
@Table(name = "treadmill")
public class Treadmill {
    @Id
    @Column(name = "code")
    private String code;

    @Column(name = "model")
    private String model;

    public Treadmill() {

    }
    public Treadmill(String code,  String model) {
        this.code = code;
        this.model = model;
    }

    // Getters
    public String getCode() {
        return code;
    }

    public String getModel() {
        return model;
    }

    // Setters
    public void setCode(String code) {
        this.code = code;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String toString() {
        return "Treadmill{" + "code=" + code + ", model=" + model + '}';
    }
}
