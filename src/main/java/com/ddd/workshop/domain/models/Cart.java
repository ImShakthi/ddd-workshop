package com.ddd.workshop.domain.models;

import java.util.ArrayList;
import java.util.List;


public class Cart {
    private final List<Product> products = new ArrayList<>();

    public void add(Product product) {
        System.out.println("added item" + product.getName());
        products.add(product);
    }

    public List<Product> getItems() {
        return products;
    }
}
