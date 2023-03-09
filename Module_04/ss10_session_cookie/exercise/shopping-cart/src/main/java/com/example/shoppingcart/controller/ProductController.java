package com.example.shoppingcart.controller;

import com.example.shoppingcart.model.Cart;
import com.example.shoppingcart.model.Product;
import com.example.shoppingcart.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Map;
import java.util.Optional;

@Controller
@SessionAttributes
public class ProductController {
    @Autowired
    IProductService productService;

    @ModelAttribute("cart")
    public Cart setupsCart(){
        return new Cart();
    }

    @GetMapping("/shop")
    public ModelAndView showShop(){
        ModelAndView modelAndView = new ModelAndView("/shop");
        modelAndView.addObject("products", productService.findAll());
        return modelAndView;
    }

    @GetMapping("/add/{id}")
    public String addToCart(@PathVariable Integer id, @ModelAttribute Cart cart, @RequestParam("action") String action) {
        Optional<Product> productOptional = productService.findById(id);
        if (!productOptional.isPresent()) {
            return "/error.404";
        }
        if (action.equals("show")) {
            cart.addProduct(productOptional.get());
            return "redirect:/shopping-cart";
        }
        cart.addProduct(productOptional.get());
        return "redirect:/shop";
    }

    @GetMapping("/view/{id}")
    public String getPageViewProduct(@PathVariable("id") Integer id, Model model){
        Optional<Product> product = productService.findById(id);
        model.addAttribute("product",product);
        return "/view";
    }

    @GetMapping("/remove/{id}")
    public String removeToCart(@PathVariable("id") Integer id, @ModelAttribute Cart cart,
                               @RequestParam(value = "action", required = false, defaultValue = "") String action) {
        Optional<Product> product = productService.findById(id);
        if (!product.isPresent()) {
            return "/error.404";
        }

        Map.Entry<Product, Integer> itemEntry = cart.selectItemInCart(product.get());

        if (itemEntry.getValue() == 1 || action.equals("delete")) {
            cart.removeProduct(itemEntry.getKey());
            return "redirect:/shopping-cart";
        }
        cart.decreaseQuantity(product.get());
        return "redirect:/shopping-cart";
    }

    @GetMapping("/pay")
    public String solveMoney(RedirectAttributes redirectAttributes, @ModelAttribute Cart cart) {
        float payment = cart.countTotalPayment();
        if (cart.removeAllProduct()) {
            redirectAttributes.addFlashAttribute("mess", "Thanh toán thành công, tổng tiền là: " + payment );
        } else {
            redirectAttributes.addFlashAttribute("mess", "Giỏ hàng rỗng nên không thể thanh toán");
        }
        return "redirect:/shopping-cart";
    }
}
