package com.ddd.workshop.domain.models;

import junit.framework.TestCase;
import org.junit.Assert;

import java.util.Currency;

public class CartTest extends TestCase {

    public void testShouldItemsInCart() {
        Cart cart = new Cart();
        Currency inr = Currency.getInstance("INR");
        Item batItem = Item.builder().product(new Product("GM Cricket Bat", 10.50, inr)).quantity(2).build();
        Item ipadItem = Item.builder().product(new Product("IPad Pro", 100, inr)).quantity(1).build();
        Item inkItem = Item.builder().product(new Product("Hero Ink Pen", 15, inr)).quantity(1).build();

        cart.add(inkItem);
        cart.add(ipadItem);
        cart.add(batItem);

        Cart cart2 = new Cart();
        cart2.add(inkItem);
        cart2.add(ipadItem);
        cart2.add(batItem);

        Assert.assertNotEquals(cart, cart2);
    }
}
