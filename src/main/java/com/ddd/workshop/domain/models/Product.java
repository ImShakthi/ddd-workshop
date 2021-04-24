package com.ddd.workshop.domain.models;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class Product {
    private final String name;
    private final Price price;
}
