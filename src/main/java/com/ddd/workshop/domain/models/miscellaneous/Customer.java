package com.ddd.workshop.domain.models.miscellaneous;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class Customer {

    private Address address;

    private final List<Account> accounts;

    public void updateAddress(Address address) {
        this.address = address;
        accounts.stream().forEach(account -> account.updateAddress(address));
    }
}
