package com.microservice.orderservice;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {
    private final ProductClient productClient;

    @GetMapping("/create/{productId}")
    public String getProductInfo(@PathVariable Long productId) {
        ProductDTO dto =  productClient.getProductById(productId);
        return "Ordered product: " + dto.getProductName() + " with price: " + dto.getProductPrice();
    }
}
