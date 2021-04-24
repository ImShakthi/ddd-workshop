package com.ddd.workshop.domain.models;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class Order {
    private List<Product> products;
}
