package com.example.product_be.service;

import com.example.product_be.model.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();

    Category findId(Integer id);
}
