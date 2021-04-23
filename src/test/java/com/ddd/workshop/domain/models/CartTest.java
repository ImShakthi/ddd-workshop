package com.ddd.workshop.domain.models;

import junit.framework.TestCase;
import org.junit.Assert;

public class CartTest extends TestCase {

    public void testShouldItemsInCart() {
        Cart cart = new Cart();
        Item batItem = Item.builder().product(new Product("GM Cricket Bat")).quantity(2).build();
        Item ipadItem = Item.builder().product(new Product("IPad Pro")).quantity(1).build();
        Item inkItem = Item.builder().product(new Product("Hero Ink Pen")).quantity(1).build();

        cart.add(inkItem);
        cart.add(ipadItem);
        cart.add(batItem);

        System.out.println(cart.getItems());
        cart.getRemovedItems();

        Cart cart2 = new Cart();
        cart2.add(inkItem);
        cart2.add(ipadItem);
        cart2.add(batItem);

        Assert.assertNotEquals(cart, cart2);
    }
}
