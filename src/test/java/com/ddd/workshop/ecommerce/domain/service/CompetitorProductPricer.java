package com.ddd.workshop.ecommerce.domain.service;

import com.ddd.workshop.ecommerce.domain.models.Price;

import java.util.Currency;
import java.util.HashMap;
import java.util.Map;

public class CompetitorProductPricer {
    private static Map<String, Price> competitorProductPricing = null;

    static {
        if (competitorProductPricing == null) {
            competitorProductPricing = new HashMap<>();

            Currency inr = Currency.getInstance("INR");
            competitorProductPricing.put("GM Cricket Bat", new Price(120, inr));
            competitorProductPricing.put("IPad Pro", new Price(100, inr));
            competitorProductPricing.put("Hero Ink Pen", new Price(50, inr));
        }
    }

    public static Price getDiscountPrice(String productName) {
        return competitorProductPricing.get(productName).reduceByPercentage(10);
    }
}
