package org.example.StoreMenu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StoreMenu {
    List<MenuItem> menu;
    ShoppingCart cart;

    public StoreMenu() {
        cart = new ShoppingCart();
        menu = new ArrayList<>();
        initializeMenu();
    }

    public void addMenuItem(MenuItem item) {
        menu.add(item);
    }

    public void initializeMenu() {
        addMenuItem(new MenuItem("Invisible Apple", 5.00, "Makes you invisible for 1 minute."));
        addMenuItem(new MenuItem("Speedy Banana", 3.50, "Boosts your typing speed."));
        addMenuItem(new MenuItem("Floating Orange", 4.25, "Lets you float in the air."));
        addMenuItem(new MenuItem("Time Travel Tomato", 7.75, "Travel back 5 seconds in time."));
        addMenuItem(new MenuItem("Giant Growth Grape", 6.00, "Doubles your size for 10 minutes."));
    }

    public void showMenu() {
        System.out.println("List of Menu");
        for (int i = 0; i < menu.size(); i++) {
            System.out.printf("%d - %s: %f\n", i, menu.get(i).getName(), menu.get(i).getPrice());
        }
    }

    public void handleUserSelection() {
        Scanner sc = new Scanner(System.in);
        boolean isRunning = true;
        showMenu();
        do {
            System.out.println("\n1. Show menu");
            System.out.println("2. Show cart");
            System.out.println("3. checkout");
            System.out.println("4. Add Item to cart");
            System.out.print("Please select an option: ");
            switch (sc.nextInt()) {
                case 1:
                    showMenu();
                    break;
                case 2:
                    if (cart.getItems().isEmpty()) {
                        System.out.println("Your cart is empty");
                        break;
                    }
                    System.out.println("Your cart:");
                    for (MenuItem item : cart.getItems()) {
                        System.out.println(item);
                    }
                    break;
                case 3:
                    System.out.println("Thank you for shopping with us!");
                    System.out.println("Total price: $" + cart.getTotalPrice());
                    isRunning = false;
                    break;
                case 4:
                    System.out.println("Add item to your cart:");
                    int itemIndex = sc.nextInt();
                    cart.addItem(menu.get(itemIndex));
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        } while (isRunning);
    }
}
