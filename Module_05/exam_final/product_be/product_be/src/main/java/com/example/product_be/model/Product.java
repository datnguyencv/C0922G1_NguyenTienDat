package com.example.product_be.model;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String code;
    private String name;
    private Integer quantity;
    private Integer price;
    private String inputDate;
    @ManyToOne
    @JoinColumn(name = "categoryId", referencedColumnName = "id")
    private Category category;

    public Product() {
    }

    public Product(Integer id, String code, String name, Integer quantity, Integer price, String inputDate, Category category) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.inputDate = inputDate;
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getInputDate() {
        return inputDate;
    }

    public void setInputDate(String inputDate) {
        this.inputDate = inputDate;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
