package com.microservice.productservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/products")
public class ProductController {

    List<Product> productList = List.of(
        new Product(1L, "Laptop", 1200.00),
        new Product(2L, "Smartphone", 800.00),
        new Product(3L, "Tablet", 400.00)
    );

    @GetMapping
    public List<Product> getProducts() {
        return productList;
    }
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productList.stream()
                .filter(product -> Objects.equals(product.getId(), id))
                .findFirst()
                .orElse(null);
    }

}
