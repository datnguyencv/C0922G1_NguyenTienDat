package com.example.exam3.model;

public class Food {
    private int id;
    private String code_id;
    private String name;
    private String start_date;
    private String end_date;
    private String description;

    public Food() {
    }

    public Food(int id, String code_id, String name, String start_date, String end_date, String description) {
        this.id = id;
        this.code_id = code_id;
        this.name = name;
        this.start_date = start_date;
        this.end_date = end_date;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode_id() {
        return code_id;
    }

    public void setCode_id(String code_id) {
        this.code_id = code_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

