package com.calbert.demo.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.List;

@JsonPropertyOrder({
        "likes",
        "comments",
        "createdDate",
        "content",
        "id"
})
@Component
@Entity
public class PostSerialization {
    @Id
    private int id;

    //@JsonProperty("postedAt")
    private Instant createdDate;

    private String content;

    @JsonIgnore
    private int likes;

    private List<String> comments;

    @JsonProperty("createdDate")
    public String getReadableCreatedDate() {
        return (DateTimeFormatter.ofPattern("YYYY-MM-dd")
                .withZone(ZoneId.systemDefault())
                .format(createdDate));
    }

    // Constructor
    public PostSerialization() {

    }
    public PostSerialization(int id, Instant createdDate, String content, int likes, List<String> comments) {
        this.id = id;
        this.createdDate = createdDate;
        this.content = content;
        this.likes = likes;
        this.comments = comments;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Instant getCreatedDate() {
        return createdDate;
    }
    public void setCreatedDate(Instant createdDate) {
        this.createdDate = createdDate;
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    public int getLikes() {
        return likes;
    }
    public void setLikes(int likes) {
        this.likes = likes;
    }

    public List<String> getComments() {
        return comments;
    }
    public void setComments(List<String> comments) {
        this.comments = comments;
    }
}
