package org.launchcode.java.studios.restaurantmenu;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private ArrayList<MenuItem> restaurantMenu = new ArrayList<>();
    private Date updated;



    public static void main(String[] args) {
        Menu todayMenu = new Menu();
        MenuItem spaghetti = new MenuItem("spaghetti", "pasta and red sauce", 10.00, "pasta", true);
        MenuItem cheesePizza = new MenuItem("cheese pizza", "dough, sauce, and cheese", 15.00, "pizza", true);
        todayMenu.addMenuItem(spaghetti);
        todayMenu.addMenuItem(cheesePizza);
        todayMenu.readItemsOnMenu();
        todayMenu.menuWasUpdated();
    }

    public void addMenuItem (MenuItem item){
        this.restaurantMenu.add(item);
        this.updated = new Date();
    }

    //read items on menu

    public void readItemsOnMenu(){
        for (MenuItem food: this.restaurantMenu) {
            System.out.println("The item name is " + food.getMenuItem() + " and the description is " + food.getItemDescription());
        }
    }

    public void menuWasUpdated(){
        System.out.println("The menu was updated on " + this.updated);
    }
};

