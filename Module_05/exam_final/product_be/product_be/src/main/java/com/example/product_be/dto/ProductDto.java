package com.example.product_be.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


public class ProductDto {
    private Integer id;
    @NotBlank(message = "Không để trống")
    private String code;
    @NotBlank(message = "Không để trống")
    private String name;
    @NotNull(message = "Không để trống")
    private Integer quantity;
    @NotNull(message = "Không để trống")
    private Integer price;
    @NotBlank(message = "Không để trống")
    private String inputDate;
    private CategoryDto categoryDto;

    public ProductDto() {
    }

    public ProductDto(Integer id, String code, String name, Integer quantity, Integer price, String inputDate, CategoryDto categoryDto) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.inputDate = inputDate;
        this.categoryDto = categoryDto;
    }

    public ProductDto(String code, String name, Integer quantity, Integer price, String inputDate, CategoryDto categoryDto) {
        this.code = code;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.inputDate = inputDate;
        this.categoryDto = categoryDto;
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

    public CategoryDto getCategoryDto() {
        return categoryDto;
    }

    public void setCategoryDto(CategoryDto categoryDto) {
        this.categoryDto = categoryDto;
    }

    public void setCategoryDto(Integer id, String name) {
    }
}
