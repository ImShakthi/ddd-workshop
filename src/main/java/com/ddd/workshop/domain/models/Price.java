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
    private final double price;
    private final Currency currency;
}
