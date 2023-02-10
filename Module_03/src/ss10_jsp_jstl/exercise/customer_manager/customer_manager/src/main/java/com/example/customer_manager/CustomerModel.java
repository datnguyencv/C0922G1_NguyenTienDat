package com.example.customer_manager;

public class CustomerModel {
    private int id;
    private String name;
    private String date_of_birth;
    private String address;
    private String link;

    public CustomerModel() {
    }

    public CustomerModel(int id, String name, String date_of_birth, String address, String link) {
        this.id = id;
        this.name = name;
        this.date_of_birth = date_of_birth;
        this.address = address;
        this.link = link;
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

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
