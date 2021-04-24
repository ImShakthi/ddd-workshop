package com.ddd.workshop.ecommerce.domain.models;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Product {
    private final String name;
    private final Price price;
}
