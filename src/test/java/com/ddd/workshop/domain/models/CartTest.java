package com.ddd.workshop.domain.models;

import junit.framework.TestCase;

public class CartTest extends TestCase {
    public void testShouldAddIpadProToCart() {
        Cart cart = new Cart();

        Product product = new Product("IPad Pro");
        cart.add(product);
    }
}
