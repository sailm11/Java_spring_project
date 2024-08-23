package com.ecom.micro_ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.micro_ecommerce.model.Product;
import com.ecom.micro_ecommerce.service.ProductService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {
    @Autowired
    private ProductService ps;

    // @GetMapping("/")
    // public void getApi() {
    // System.out.println("API.....");

    // }

    @GetMapping("/products")
    public List<Product> getProducts() {
        return ps.getProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable int id) {
        return ps.geProduct(id);
    }

}
