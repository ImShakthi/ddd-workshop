package com.ddd.workshop.domain.models;

import junit.framework.TestCase;
import org.junit.Assert;

public class CartTest extends TestCase {
    public void testShouldAddIpadProToCart() {
        Cart cart = new Cart();

        Product product = new Product("IPad Pro");
        cart.add(product);
        Assert.assertEquals("Ipad Pro", cart.getItems().get(0).getName());
    }

    public void testShouldAddHeroInkPenToCart() {
        Cart cart = new Cart();
        Product product = new Product("Hero Ink Pen");
        cart.add(product);
        Assert.assertEquals("Hero Ink Pen", cart.getItems().get(0).getName());

    }
}
