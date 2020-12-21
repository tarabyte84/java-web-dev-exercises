package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();


        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
        Comparator comparator1 = new FlavorComparator();

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
        flavors.sort(comparator1);

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        Comparator comparator2 = new ConeComparator();
        cones.sort(comparator2);
        System.out.println(cones.toString());

    }
}
