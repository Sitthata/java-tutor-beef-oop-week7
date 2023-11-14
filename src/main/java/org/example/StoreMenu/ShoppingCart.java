package org.example.StoreMenu;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<MenuItem> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public double getTotalPrice() {
        double total = 0;
        for (MenuItem item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public List<MenuItem> getItems() {
        return this.items;
    }
}
