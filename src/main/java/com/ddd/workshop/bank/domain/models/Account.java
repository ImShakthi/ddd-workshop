package com.ddd.workshop.bank.domain.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Account {

    private Address address;

    public void updateAddress(Address address) {
        this.address = address;
    }
}
