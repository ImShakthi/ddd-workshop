package com.ddd.workshop.ecommerce.domain.models;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class Order {
    private List<Product> products;
}
