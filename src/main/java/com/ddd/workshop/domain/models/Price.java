package com.ddd.workshop.domain.models;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.Currency;

@AllArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class Price {
    private final double amount;
    private final Currency currency;

    public Price reduceByPercentage(double discountPercentage) {
        double discountAmount = this.amount * (discountPercentage / 100);
        return new Price(this.amount - discountAmount, this.currency);
    }
}
