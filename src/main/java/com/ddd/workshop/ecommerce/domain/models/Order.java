package com.ddd.workshop.ecommerce.domain.models;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class Order {
    private List<Product> products;

    public double totalCost(){
        double shippingCost = this.shippingCost();
        double productsCost = products.stream().mapToDouble(product -> product.getPrice().getAmount()).sum();
        return productsCost + shippingCost;
    }

    private double shippingCost() {
        return products.stream().mapToDouble(product -> product.getWeight()*.01).sum();
    }
}
