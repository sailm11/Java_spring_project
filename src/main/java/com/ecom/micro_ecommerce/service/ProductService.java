package com.ecom.micro_ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ecom.micro_ecommerce.model.Product;
import com.ecom.micro_ecommerce.reepository.ProductRepo;

@Component
@Service
public class ProductService {
    // private JdbcTemplate template;

    // private ConnectorForSql cs;
    @Autowired
    private ProductRepo pr;

    public List<Product> getProducts() {
        // System.out.println(pr.findAll());
        return pr.findAll();
    }

    public Product geProduct(int id) {
        return pr.findById(id).orElse(new Product());
    }
}
