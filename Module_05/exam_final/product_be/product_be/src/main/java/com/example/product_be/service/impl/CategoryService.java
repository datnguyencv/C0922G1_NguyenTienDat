package com.example.product_be.service.impl;

import com.example.product_be.model.Category;
import com.example.product_be.repository.ICategoryRepository;
import com.example.product_be.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    private ICategoryRepository categoryRepository;
    @Override
    public List<Category> findAll() {
        return categoryRepository.getAll();
    }
}
