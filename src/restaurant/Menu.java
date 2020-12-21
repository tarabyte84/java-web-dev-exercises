package restaurant;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Scanner;

public class Menu {

    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private LocalDate lastUpdated;

    public void addMenuItem(MenuItem menuItem) {
        this.menuItems.add(menuItem);
        this.lastUpdated = LocalDate.now();
    }

    public void removeMenuItem(MenuItem menuItem) {
        this.menuItems.remove(menuItem);
        this.lastUpdated = LocalDate.now();
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public String toString() {
        String menu = "";
        for(MenuItem item: this.menuItems) {
            menu += item.toString() + "\n";
            return menu;
        }
        return menu;
    }



//        for(int i=0; i<wholeMenu.size(); i++) {
//            System.out.println(wholeMenu.get(i));
//        }







}
