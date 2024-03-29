package com.example.blog.controller;

import com.example.blog.model.Blog;
import com.example.blog.model.Category;
import com.example.blog.service.blog.IBlogService;
import com.example.blog.service.category.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryRestController {

    @Autowired
    private IBlogService blogService;

    @Autowired
    private ICategoryService categoryService;

    @GetMapping("list-category")
    public ResponseEntity<Page<Category>> findAllCategory(
            @RequestParam(required = false, defaultValue = "") String nameSearch,
            @PageableDefault(size = 5, page = 0, sort = "localDate", direction = Sort.Direction.ASC)
            Pageable pageable) {
        Page<Category> categories = categoryService.findAll(nameSearch.trim(), pageable);
        if (categories.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

    @GetMapping("/list-blog-by-category")
    public ResponseEntity<Page<Blog>> findBlogByCategory(
            Model model,
            @RequestParam(required = false, defaultValue = "0") Long idSearch,
            @PageableDefault(size = 5, page = 0, sort = "localDate", direction = Sort.Direction.ASC)
            Pageable pageable) {
        Page<Blog> blogs = blogService.findByCategory(idSearch, pageable);
        if (blogs.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogs, HttpStatus.OK);
    }
}
