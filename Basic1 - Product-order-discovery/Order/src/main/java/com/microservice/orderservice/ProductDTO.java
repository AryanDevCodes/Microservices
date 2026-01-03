package com.microservice.orderservice;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ProductDTO {
    private Long id;
    private String productName;
    private Double productPrice;

    public ProductDTO(String productName, Double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

}
