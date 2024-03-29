package com.example.productmanagement.repository.impl;

import com.example.productmanagement.model.Product;
import com.example.productmanagement.repository.IProductRepository;

import java.util.*;

public class ProductRepository implements IProductRepository {
    private static final Map<Integer, Product> products = new HashMap<>();

    static {
        products.put(1, new Product(1, "Nokia X", 800, "Điện thoại", "Microsoft"));
        products.put(2, new Product(2, "Iphone X", 1500, "Điện thoại", "Iphone"));
        products.put(3, new Product(3, "Samsung", 10000, "Điện thoại", "Samsung"));
        products.put(4, new Product(4, "Samsung 15", 30000, "Điện thoại", "Iphone"));
    }

    @Override
    public List<Product> findAllProduct() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void saveProduct(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public void updateProduct(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void removeProduct(int id) {
        products.remove(id);
    }

    @Override
    public List<Product> findByName(String nameProduct) {
        List<Product> products1 = new ArrayList<>(products.values());
        List<Product> products2 = new ArrayList<>();
        if (Objects.equals(nameProduct, "")) {
            return products2;
        }
        String[] nameChar = nameProduct.toLowerCase().split(" ");
        for (Product product : products1) {
            for (String s : nameChar) {
                if (product.getNameProduct().toLowerCase().contains(s)) {
                    products2.add(product);
                    break;
                }
            }
        }
        return products2;
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }
}
