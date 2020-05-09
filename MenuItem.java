package org.launchcode.java.studios.restaurantmenu;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class MenuItem {

    private String menuItem;
    private String itemDescription;
    private Double itemPrice;
    private String itemCategory;
    private static ArrayList<String> categoryOptions = new ArrayList<>();
    private Boolean isNew;
    private Date added;

    private static void addCategoryOptions() {
        categoryOptions.add("appetizer");
        categoryOptions.add("main course");
        categoryOptions.add("dessert");
//        if(!categoryOptions.contains(this.itemCategory)) {
//            System.out.println("Menu Item must be an appetizer, main course, or dessert");
//        }
    }

    protected MenuItem(String menuItem, String itemDescription, Double itemPrice, String itemCategory, Boolean isNew) {
        this.menuItem = menuItem;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
        this.itemCategory = itemCategory;
        this.isNew = isNew;
        addCategoryOptions();
    }

    public String getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(String menuItem) {
        this.menuItem = menuItem;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public ArrayList<String> getCategoryOptions() {
        return categoryOptions;
    }

    public void setCategoryOptions(ArrayList<String> categoryOptions) {
        this.categoryOptions = categoryOptions;
    }

    public Boolean getNew() {
        return isNew;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MenuItem)) return false;
        MenuItem menuItem1 = (MenuItem) o;
        return getMenuItem().equals(menuItem1.getMenuItem()) &&
                getItemDescription().equals(menuItem1.getItemDescription()) &&
                getItemPrice().equals(menuItem1.getItemPrice()) &&
                getItemCategory().equals(menuItem1.getItemCategory());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMenuItem(), getItemDescription(), getItemPrice(), getItemCategory());
    }
}
