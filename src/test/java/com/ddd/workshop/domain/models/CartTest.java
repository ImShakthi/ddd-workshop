package com.ddd.workshop.domain.models;

import junit.framework.TestCase;
import org.junit.Assert;

import java.util.Currency;
import java.util.HashMap;
import java.util.Map;

public class CartTest extends TestCase {
    Map<String, Price> competitorProductPricing = null;

    public void testShouldItemsInCart() {
        Currency inr = Currency.getInstance("INR");
        Item batItem = Item.builder()
                .product(new Product("GM Cricket Bat", new Price(10.50, inr)))
                .quantity(2)
                .build();
        Item ipadItem = Item.builder()
                .product(new Product("IPad Pro", new Price(10, inr)))
                .quantity(1)
                .build();
        Item inkItem = Item.builder()
                .product(new Product("Hero Ink Pen", new Price(15, inr)))
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
                .product(new Product("GM Cricket Bat", getDiscountPrice("GM Cricket Bat")))
                .quantity(2)
                .build();
        Item ipadItem = Item.builder()
                .product(new Product("IPad Pro", getDiscountPrice("IPad Pro")))
                .quantity(1)
                .build();
        Item inkItem = Item.builder()
                .product(new Product("Hero Ink Pen", getDiscountPrice("Hero Ink Pen")))
                .quantity(1)
                .build();

        Cart cart = new Cart();
        cart.add(inkItem);
        cart.add(ipadItem);
        cart.add(batItem);
    }

    private Price getDiscountPrice(String productName) {
        if (competitorProductPricing == null) {
            competitorProductPricing = new HashMap<>();

            Currency inr = Currency.getInstance("INR");
            competitorProductPricing.put("GM Cricket Bat", new Price(120, inr));
            competitorProductPricing.put("IPad Pro", new Price(100, inr));
            competitorProductPricing.put("Hero Ink Pen", new Price(50, inr));
        }

        return competitorProductPricing.get(productName).getDiscountedPrice(10);
    }
}
