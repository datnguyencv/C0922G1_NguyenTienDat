package com.example.currencyconverter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertController {
    @GetMapping("/")
    public String showFormConvert() {
        return "convert";
    }

    @GetMapping("/convert")
    public String convert(@RequestParam double usd, @RequestParam double vnd, Model model) {
        model.addAttribute("result", usd * vnd);
        return "convert";
    }
}
