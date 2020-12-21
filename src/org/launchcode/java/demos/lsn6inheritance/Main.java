package org.launchcode.java.demos.lsn6inheritance;

public class Main {

    public static void main(String[] args) {

        HouseCat cosmo = new HouseCat("Cosmo", 7);
        cosmo.eat();
        System.out.println(cosmo.isTired());
        cosmo.sleep();
        System.out.println(cosmo.isTired());

        HouseCat jiji = new HouseCat("Jiji");
        System.out.println(jiji.getWeight());

//        Cat plainCat = new Cat(8.6);
        HouseCat cheshireCat = new HouseCat("Cheshire", 12);
        cheshireCat.setHungry(true);
        System.out.println(cheshireCat.getWeight());
        System.out.println(cheshireCat.noise());

//        Cat salem = new Cat(8);

        HouseCat sugar = new HouseCat("Sugar", 12);
        sugar.setTired(true);
        System.out.println(sugar.noise());
    }
}
