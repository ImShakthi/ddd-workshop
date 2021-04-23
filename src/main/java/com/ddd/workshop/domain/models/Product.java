package com.ddd.workshop.domain.models;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.Currency;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class Product {
    private final String name;
    private final double price;
    private final Currency currency;
}
