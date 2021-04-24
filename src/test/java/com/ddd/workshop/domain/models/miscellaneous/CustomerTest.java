package com.ddd.workshop.domain.models.miscellaneous;

import junit.framework.TestCase;
import org.junit.Assert;

import java.util.List;

public class CustomerTest extends TestCase {

    public void testShouldUpdateCustomerAddressAndItsBankAccountsAddressAsWell() {
        Account account1 = new Account(new Address("Karur"));
        Account account2 = new Account(new Address("Chennai"));
        Customer customer = new Customer(new Address("Covai"), List.of(account1, account2));
        customer.updateAddress(new Address("Goa"));

        Assert.assertEquals("Goa", customer.getAddress().getCity());
        customer.getAccounts().forEach(account -> Assert.assertEquals("Goa", account.getAddress().getCity()));

    }
}