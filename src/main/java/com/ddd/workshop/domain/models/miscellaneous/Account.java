package com.ddd.workshop.domain.models.miscellaneous;

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
