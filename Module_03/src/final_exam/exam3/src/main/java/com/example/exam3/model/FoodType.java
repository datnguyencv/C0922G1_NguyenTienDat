package com.example.exam3.model;

public class FoodType {
    private int id;
    private String name;

    public FoodType() {
    }

    public FoodType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
