package com.ddd.workshop.ecommerce.domain.models;

import com.ddd.workshop.ecommerce.domain.domain_service.CompetitorProductPricer;
import junit.framework.TestCase;
import org.junit.Assert;

import java.util.Currency;

public class CartTest extends TestCase {
    public void testShouldItemsInCart() {
        Currency inr = Currency.getInstance("INR");
        Item batItem = Item.builder()
                .product(new Product("GM Cricket Bat", new Price(10.50, inr), 500D))
                .quantity(2)
                .build();
        Item ipadItem = Item.builder()
                .product(new Product("IPad Pro", new Price(10, inr), 500D))
                .quantity(1)
                .build();
        Item inkItem = Item.builder()
                .product(new Product("Hero Ink Pen", new Price(15, inr), 500D))
                .quantity(1)
                .build();

        Cart cart = new Cart();
        cart.add(inkItem);
        cart.add(ipadItem);
        cart.add(batItem);

        Cart cart2 = new Cart();
        cart2.add(inkItem);
        cart2.add(ipadItem);
        cart2.add(batItem);

        Assert.assertNotEquals(cart, cart2);
    }

    public void testShouldItemsInCartWithDiscount() {
        Item batItem = Item.builder()
                .product(new Product("GM Cricket Bat", CompetitorProductPricer.getDiscountPrice("GM Cricket Bat"), 100D))
                .quantity(2)
                .build();
        Item ipadItem = Item.builder()
                .product(new Product("IPad Pro", CompetitorProductPricer.getDiscountPrice("IPad Pro"), 100D))
                .quantity(1)
                .build();
        Item inkItem = Item.builder()
                .product(new Product("Hero Ink Pen", CompetitorProductPricer.getDiscountPrice("Hero Ink Pen"), 100D))
                .quantity(1)
                .build();

        Cart cart = new Cart();
        cart.add(inkItem);
        cart.add(ipadItem);
        cart.add(batItem);
        Order order = cart.checkout();
        System.out.println(order.totalCost());
    }
}
