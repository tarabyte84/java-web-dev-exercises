package restaurant;

public class Restaurant {
    public static void main(String[] args) {

        MenuItem hamburger = new MenuItem("hamburger", 5, "delicious hunk of meat between two sesame buns", "main course");
        MenuItem fries = new MenuItem("french fries", 2, "salty sticks of deep fried potato", "appetizer");
        MenuItem vanillaShake = new MenuItem("vanilla shake", 5, "creamy vanilla ice cream", "dessert");
        MenuItem grilledCheese = new MenuItem("grilled cheese", 4, "perfectly melted cheese with ripe tomato between buttery slices of texas toast", "main course");
        MenuItem cheeseCurds = new MenuItem("cheese curds", 3, "deep fried chunks of cheddar", "appetizer");
        MenuItem fudgeSundae = new MenuItem("hot fudge sundae", 4, "vanilla ice cream fudge", "dessert");

        Menu wholeMenu = new Menu();

        wholeMenu.addMenuItem(hamburger);
        wholeMenu.addMenuItem(fries);
        wholeMenu.addMenuItem(vanillaShake);
        wholeMenu.addMenuItem(grilledCheese);
        wholeMenu.addMenuItem(cheeseCurds);
        wholeMenu.addMenuItem(fudgeSundae);


    }
}
