package org.launchcode.java.studios.restaurantmenu;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private ArrayList<MenuItem> restaurantMenu;
    private Date updated;

    Menu() {
        this.restaurantMenu = new ArrayList<>();

    }

    public void addMenuItem(MenuItem item) {
        this.restaurantMenu.add(item);
        this.updated = new Date();
    }
};

//public void MenuItem getMenuItem (MenuItem food) {
//
//    return this.restaurantMenu.get
//
//
//}