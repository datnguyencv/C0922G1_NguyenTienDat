package com.example.product_be.service.impl;


import com.example.product_be.dto.ProductDto;
import com.example.product_be.model.Product;
import com.example.product_be.repository.ICategoryRepository;
import com.example.product_be.repository.IProductRepository;
import com.example.product_be.service.IProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository productRepository;
    @Autowired
    private ICategoryRepository categoryRepository;
    @Override
    public Page<Product> findAllName(String name, Pageable pageable) {
        return productRepository.getAllName(name, pageable);
    }

    @Override
    public Page<Product> findAllOption(String name, Integer id, Pageable pageable) {
        return productRepository.getAllByNameAndCategory_Id(name, id, pageable);
    }

    @Override
    public Product findWithId(Integer id) {
        return productRepository.findWithId(id);
    }

    @Override
    public void deleteProduct(Integer id) {
        productRepository.deleteProduct(id);
    }

    @Override
    public void updateProduct(Integer id, ProductDto productDto) {
        Product product = new Product();
        product.setCategory(categoryRepository.getWithId(productDto.getCategoryDto().getId()));
        BeanUtils.copyProperties(productDto, product);
        productRepository.updateProduct(
                product.getCode(),
                product.getInputDate(),
                product.getName(),
                product.getQuantity(),
                product.getPrice(),
                product.getCategory().getId(),
                product.getId());
    }

    @Override
    public void addProduct(ProductDto productDto) {
        Product product = new Product();
        product.setCategory(categoryRepository.getWithId(productDto.getCategoryDto().getId()));
        BeanUtils.copyProperties(productDto, product);
        productRepository.addProduct(product.getCode(),
                product.getInputDate(),
                product.getName(),
                product.getQuantity(),
                product.getPrice(),
                product.getCategory().getId());
    }
}
