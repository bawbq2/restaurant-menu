package org.launchcode.java.studios.restaurantmenu;

public class Restaurant {
    public static void main(String[] args) {
        Menu todayMenu = new Menu();
        MenuItem spaghetti = new MenuItem("spaghetti", "pasta and red sauce", 10.00, "pasta", false);
        MenuItem cheesePizza = new MenuItem("cheese pizza", "dough, sauce, and cheese", 15.00, "pizza", true);
        todayMenu.addMenuItem(spaghetti);
        todayMenu.addMenuItem(cheesePizza);
        todayMenu.readItemsOnMenu();
        todayMenu.menuWasUpdated();
        todayMenu.isItemNew(spaghetti);
        todayMenu.removeMenuItem(spaghetti);
        todayMenu.readItemsOnMenu();
        todayMenu.readAnItemOnMenu(cheesePizza);
    }
}
