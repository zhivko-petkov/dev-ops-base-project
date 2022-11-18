package com.example.devopsbaseproject.controllers;

import com.example.devopsbaseproject.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/product/{id}")
    public String getProductById(@PathVariable Integer id, Model model){

        model.addAttribute("product", productService.getProduct(id));

        return "product";
    }
}
