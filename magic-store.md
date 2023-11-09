# The Magical Food Emporium Project

## Project Description
In this project, you will create a Java program for "The Magical Food Emporium," a whimsical shop in the town of Byteville. Your program will help manage the store's magical menu, handle customer orders, and calculate bills. As a budding programmer, your challenge is to bring magic to Merlin's shop through code!

## Background
Byteville's Magical Food Emporium is no ordinary shop. Run by the friendly wizard Merlin, it offers items with unique magical properties. However, Merlin is a bit forgetful and needs a system to keep track of orders and sales. That's where your programming skills come in!

## Objective
Build a program with the following features:

1. **Display the Magical Menu:** Show items with their names, prices, and magical properties.
2. **Handle Customer Orders:** Allow adding items to a cart, reflecting magical effects through messages.
3. **Calculate and Display the Total Bill:** Show the total cost and a whimsical thank-you message.

## Additional Challenges
- **Out-of-Stock Items:** Inform customers if an item is unavailable.
- **Budget Management:** Allow customers to set a budget and alert them if their cart exceeds it.
- **Merlin's Surprise Offer:** Randomly apply discounts to menu items.

## Implementation Details

### Classes

#### `MenuItem`
- **Fields:**
    - `String name`
    - `double price`
    - `String description`
- **Methods:**
    - Constructor
    - Getters for all fields

#### `ShoppingCart`
- **Fields:**
    - `List<MenuItem> items`
- **Methods:**
    - `void addItem(MenuItem item)`
    - `double getTotalPrice()`
    - Getters and setters as necessary

#### `StoreMenu`
- **Fields:**
    - `List<MenuItem> menuItems`
    - `ShoppingCart cart`
- **Methods:**
    - `void addMenuItem(MenuItem item)`
    - `void showMenu()`
    - `void handleUserSelection()`
    - `void checkout()`

## Initialization
Items in the menu can be initialized in the `StoreMenu` constructor using the sample data here, For example:

```java
private void initializeMenu() {
    addMenuItem(new MenuItem("Invisible Apple", 5.00, "Makes you invisible for 1 minute."));
    addMenuItem(new MenuItem("Speedy Banana", 3.50, "Boosts your typing speed."));
    addMenuItem(new MenuItem("Floating Orange", 4.25, "Lets you float in the air."));
    addMenuItem(new MenuItem("Time Travel Tomato", 7.75, "Travel back 5 seconds in time."));
    addMenuItem(new MenuItem("Giant Growth Grape", 6.00, "Doubles your size for 10 minutes."));
}
```


### Main Class

- Implement a `Main` class to initiate the program.

## Deliverables
- Source code for all classes.
- A simple text-based user interface to interact with the program.
- (Optional) Unit tests to ensure the program works as expected.

## Note
Feel free to add creative twists and additional features to make the shopping experience more magical!
