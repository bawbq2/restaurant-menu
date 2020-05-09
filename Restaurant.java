package org.launchcode.java.studios.restaurantmenu;

public class Restaurant {
    public static void main(String[] args) {
        Menu todayMenu = new Menu();
        MenuItem spaghetti = new MenuItem("spaghetti", "pasta and red sauce", 10.00, "pasta", false);
        MenuItem cheesePizza = new MenuItem("cheese pizza", "dough, sauce, and cheese", 15.00, "main course", true);
        MenuItem salad = new MenuItem("salad", "lettuce, tomato, and cheese", 8.00, "appetizer", true);
        todayMenu.addMenuItem(spaghetti);
        todayMenu.addMenuItem(spaghetti);
        todayMenu.addMenuItem(cheesePizza);
        todayMenu.readItemsOnMenu();
        System.out.println(todayMenu.getRestaurantMenu().size());
//        todayMenu.menuWasUpdated();
//        todayMenu.isItemNew(spaghetti);
//        todayMenu.removeMenuItem(spaghetti);
//        todayMenu.readItemsOnMenu();
//        todayMenu.readAnItemOnMenu(cheesePizza);
    }
}
