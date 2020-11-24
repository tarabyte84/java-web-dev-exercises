package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Number of miles driven:");
        double milesDriven = input.nextDouble();
        System.out.println("Number of gallons used:");
        double gallonsUsed = input.nextDouble();
        double mpg = milesDriven/gallonsUsed;

        System.out.println("You got " +mpg+ " miles per gallon");

    }
}
