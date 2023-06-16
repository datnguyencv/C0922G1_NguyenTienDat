package com.example.product_be.controller;

import com.example.product_be.dto.ProductDto;
import com.example.product_be.model.Category;
import com.example.product_be.model.Product;
import com.example.product_be.service.ICategoryService;
import com.example.product_be.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin("*")
public class RestProductController {
    @Autowired
    private IProductService productService;
    @Autowired
    private ICategoryService categoryService;

    @GetMapping("/product")
    public ResponseEntity<Page<Product>> getAll(
            @RequestParam(name = "name", defaultValue = "") String name,
            @RequestParam(name = "categoryId",required = false) Integer categoryId,
                             @PageableDefault(size = 3, sort = "name", direction = Sort.Direction.ASC)
                             Pageable pageable){
        Page<Product> products;
        if (categoryId==null) {
            products = productService.findAllName(name, pageable);
        } else {
            products = productService.findAllOption(name, categoryId, pageable);
               }
        if (products.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("/category")
    public ResponseEntity<List<Category>> getAll(){
        List<Category> categories = categoryService.findAll();
        if (categories.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable Integer id) {
        productService.deleteProduct(id);
    }

    @PostMapping("/product")
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@Validated @RequestBody ProductDto productDto, BindingResult bindingResult){
        if (!bindingResult.hasErrors()) {
            productService.addProduct(productDto);
        } else {
            getResponseEntity(bindingResult);
        }
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping("/product/{id}")
    public void update(@Validated @PathVariable int id, @RequestBody ProductDto productDto, BindingResult bindingResult){
        if (!bindingResult.hasErrors()) {
            productService.updateProduct(id,productDto);
        } else {
            getResponseEntity(bindingResult);
        }
    }

    private void getResponseEntity(BindingResult bindingResult) {
        Map<String, String> map = new LinkedHashMap<>();
        List<FieldError> errors = bindingResult.getFieldErrors();
        for (FieldError error : errors) {
            if (!map.containsKey(error.getField())) {
                map.put(error.getField(), error.getDefaultMessage());
            }
        }
    }
}
