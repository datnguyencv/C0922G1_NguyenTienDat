package com.example.blog.controller;

import com.example.blog.model.Blog;
import com.example.blog.model.Category;
import com.example.blog.service.blog.IBlogService;
import com.example.blog.service.category.ICCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class BlogController {
    @Autowired
    IBlogService blogService;
    @Autowired
    ICCategoryService categoryService;

    @GetMapping("")
    public String showBlog(Model model,
                           @RequestParam(required = false, defaultValue = "")
                           String nameSearch, Pageable pageable) {
        model.addAttribute("blog", blogService.findAll(nameSearch, pageable));
        return "/blog/index";
    }

    @GetMapping("/blog-list")
    String blogList(Model model,
                    @RequestParam(required = false, defaultValue = "")
                    String nameSearch, Pageable pageable) {
        Page<Blog> blogsTemp = blogService.findAll(nameSearch.trim(), pageable);
        model.addAttribute("blogTemp", blogsTemp);
        model.addAttribute("blogNew", new Blog());
        model.addAttribute("nameSearch", nameSearch);
        model.addAttribute("category", categoryService.findALLCategory());
        return "/blog/list";
    }

    @GetMapping("/blog-list-by-category")
    String findByCategoryBlog(Model model,
                              @RequestParam(required = false, defaultValue = "")
                              Integer idSearch, Pageable pageable) {
        model.addAttribute("blogTemp", blogService.findCategory(idSearch, pageable));
        model.addAttribute("blogNew", new Blog());
        model.addAttribute("id", idSearch);
        model.addAttribute("category", categoryService.findALLCategory());
        return "/blog/list";
    }

    @GetMapping("/edit-blog/{id}")
    public String editBlog(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        model.addAttribute("categories", categoryService.findALLCategory());
        return "/blog/edit";
    }

    @GetMapping("/view-blog/{id}")
    public String getViewPage(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        model.addAttribute("categories", categoryService.findALLCategory());
        return "/blog/view";
    }

    @PostMapping("/update-blog")
    public String updateBlog(@ModelAttribute("blog") Blog blog, Model model) {
        blogService.updateBlog(blog);
        model.addAttribute("message", "Update successful!");
        return "/blog/edit";
    }

    @PostMapping("/create-blog")
    public String saveBlog(@ModelAttribute("blog") Blog blog, RedirectAttributes redirectAttributes) {
        blogService.createBlog(blog);
        redirectAttributes.addFlashAttribute("mess", "Add new successful!");
        return "redirect:/list-blog";
    }

}
