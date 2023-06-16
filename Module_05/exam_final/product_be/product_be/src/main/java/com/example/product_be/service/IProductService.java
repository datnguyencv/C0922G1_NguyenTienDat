package com.example.product_be.service;

import com.example.product_be.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IProductService {
    Page<Product> findAllName(String name, Pageable pageable);
    Page<Product> findAllOption(String name, Integer id, Pageable pageable);
    Product findProductWithId();
    void deleteProduct();
    void updateProduct();
    void addProduct();
}
