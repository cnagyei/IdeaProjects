package com.oath.africa.business;

import jakarta.persistence.*;

@Entity
@Table(name = "movie")
public class Movie {
    @Id
    @GeneratedValue
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "genre")
    private String genre;

    @Column(name = "rating")
    private int rating;

    @Column(name = "year_of_release")
    private int yearOfRelease;

    // Constructors
    public Movie(long id, String name, String genre, int rating, int yearOfRelease) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.rating = rating;
        this.yearOfRelease = yearOfRelease;
    }

    public Movie(String name, String genre, int rating, int yearOfRelease) {
        this.name = name;
        this.genre = genre;
        this.rating = rating;
        this.yearOfRelease = yearOfRelease;
    }

    public Movie(String name, String genre, int rating) {
        this.name = name;
        this.genre = genre;
        this.rating = rating;
    }

    public Movie(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    public Movie(String name) {
        this.name = name;
    }

    public Movie() {}

    // toString
    public String toString() {
        return "Movie{" +
                "name=" + name +
                ", genre=" + genre +
                ", rating=" + rating +
                ", yearOfRelease=" + yearOfRelease +
                "}";
    }

    // Getters and setters
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }
    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }
}
