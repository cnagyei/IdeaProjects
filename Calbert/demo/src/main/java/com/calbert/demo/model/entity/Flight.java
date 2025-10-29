package com.calbert.demo.model.entity;

public class Flight {
    private int id;
    private String from;
    private String to;
    private String gate;

    public Flight(int id, String from, String to, String gate) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.gate = gate;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }
    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }
    public void setTo(String to) {
        this.to = to;
    }

    public String getGate() {
        return gate;
    }
    public void setGate(String gate) {
        this.gate = gate;
    }
}
