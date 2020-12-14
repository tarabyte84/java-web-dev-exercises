package restaurant;

import java.util.ArrayList;

import java.util.Scanner;

public class Menu {

    public static void menuList() {

        MenuItem hamburger = new MenuItem("hamburger", 5, "delicious hunk of meat between two sesame buns", "main course", true);
        MenuItem fries = new MenuItem("french fries", 2, "salty sticks of deep fried potato", "appetizer", false);
        MenuItem vanillaShake = new MenuItem("vanilla shake", 5, "creamy vanilla ice cream", "dessert", true);
        MenuItem grilledCheese = new MenuItem("grilled cheese", 4, "perfectly melted cheese with ripe tomato between buttery slices of texas toast", "main course", false);
        MenuItem cheeseCurds = new MenuItem("cheese curds", 3, "deep fried chunks of cheddar", "appetizer", false);
        MenuItem fudgeSundae = new MenuItem("hot fudge sundae", 4, "vanilla ice cream fudge", "dessert", false);

        ArrayList<Object> wholeMenu = new ArrayList<>();
        wholeMenu.add(hamburger);
        wholeMenu.add(fries);
        wholeMenu.add(vanillaShake);
        wholeMenu.add(grilledCheese);
        wholeMenu.add(cheeseCurds);
        wholeMenu.add(fudgeSundae);

        for(int i=0; i<wholeMenu.size(); i++) {
            System.out.println(wholeMenu.get(i));
        }


    }

//    public static void printItem() {
//        for(int i=0; i<wholeMenu.size; i++) {
//
//        }
//    }




}
