package com.ecom.micro_ecommerce.reepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.ecom.micro_ecommerce.model.Product;

@Component
@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
