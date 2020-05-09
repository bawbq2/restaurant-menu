package org.launchcode.java.studios.restaurantmenu;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private ArrayList<MenuItem> restaurantMenu;
    private Date updated;

    Menu () {
        this.restaurantMenu = new ArrayList<>();
        this.updated = new Date();
    }


    public void addMenuItem (MenuItem item){
        if (!this.restaurantMenu.contains(item)) {
            if (!item.getCategoryOptions().contains(item.getItemCategory())) {
                System.out.println("The item must be a main course, appetizer, or dessert!");
            } else {
                this.restaurantMenu.add(item);
                this.updated = new Date();
            }
        } else {
            System.out.println(item + " is already on the menu!");
        }
    }

    public void removeMenuItem(MenuItem item){
        if (this.restaurantMenu.contains(item)) {
            this.restaurantMenu.remove(item);
            this.updated = new Date();
        }
    }

    //read items on menu

    public void readItemsOnMenu(){
        for (MenuItem food: this.restaurantMenu) {
            System.out.println("The item name is " + food.getMenuItem() + " and the description is " + food.getItemDescription());
        }
    }

    public void readAnItemOnMenu(MenuItem item){
        System.out.println("The item you are interested in is " + item.getMenuItem());
    }

    public void menuWasUpdated(){
        System.out.println("The menu was updated on " + this.updated);
    }

    public void isItemNew(MenuItem food){
        if (food.getNew()) {
            System.out.println(food.getMenuItem() + " is new!");
        } else {
            System.out.println(food.getMenuItem() + " is a classic choice.");

        }
    }

    public ArrayList<MenuItem> getRestaurantMenu() {
        return restaurantMenu;
    }

    public void setRestaurantMenu(ArrayList<MenuItem> restaurantMenu) {
        this.restaurantMenu = restaurantMenu;
    }

    public Date getUpdated() {
        return updated;
    }

};



