package com.example.products.controller;

import com.example.products.model.SmartPhone;
import com.example.products.service.ISmartPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/smartphone")
public class SmartPhoneController {
    @Autowired
    ISmartPhoneService smartPhoneService;

    @GetMapping("")
    public String getHomePage(Model model){
        model.addAttribute("smartphones", smartPhoneService.findAll());
        return "/index";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("smartphone") SmartPhone smartPhone, RedirectAttributes attributes) {
        smartPhone.setId((int) (Math.random() * 10000));
        smartPhoneService.save(smartPhone);
        attributes.addFlashAttribute("mess", "Create successful!");
        return "redirect: /smartphone";
    }

    @GetMapping("/edit/{id}")
    public String edit(Model model, @PathVariable("id") int id) {
        model.addAttribute("smartphone", this.smartPhoneService.findById(id));
        return "/edit";
    }

    @PostMapping("/update")
    public String update(Model model, @ModelAttribute("smartphone") SmartPhone smartPhone) {
        this.smartPhoneService.update(smartPhone);
        model.addAttribute("mess", "Update successful!");
        return "/edit";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("idDelete") int id, RedirectAttributes attributes) {
        this.smartPhoneService.delete(id);
        attributes.addFlashAttribute("mess", "Delete successful!");
        return "redirect: /smartphone";
    }

    @GetMapping("/view/{id}")
    public String view(@PathVariable("id") int id, Model model) {
        model.addAttribute("smartphone", this.smartPhoneService.findById(id));
        return "/view";
    }

    @GetMapping("/search")
    public String search(@RequestParam("search") String name, Model model) {
        model.addAttribute("smartphones", this.smartPhoneService.findByName(name) );
        return "/index";
    }

}
