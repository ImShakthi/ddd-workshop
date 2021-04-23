package com.ddd.workshop.domain.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@EqualsAndHashCode
public class Cart {
    private final List<Item> items;
    private final List<Item> removedItems;

    @Getter
    private final UUID uuid;

    public Cart() {
        uuid = UUID.randomUUID();
        items = new ArrayList<>();
        removedItems = new ArrayList<>();
    }

    public void add(Item item) {
        System.out.println("added item" + item);
        items.add(item);
    }

    public void remove(Item item) {
        System.out.println("removed item" + item);
        items.remove(item);
        removedItems.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public List<Item> getRemovedItems() { return removedItems; }
}
