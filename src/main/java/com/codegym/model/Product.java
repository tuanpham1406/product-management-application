package com.codegym.model;

public class Product {
    private int id;
    private String name;
    private String producer;
    private int amount;

    public Product() {
    }

    public Product(int id, String name, String producer, int amount) {
        this.id = id;
        this.name = name;
        this.producer = producer;
        this.amount = amount;
    }

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

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}