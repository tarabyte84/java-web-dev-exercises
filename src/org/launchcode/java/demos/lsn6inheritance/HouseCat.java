package org.launchcode.java.demos.lsn6inheritance;

public class HouseCat extends Cat {
    private String name;
    private String species = "Felis catus";

    public HouseCat(String aName, double aWeight) {
        super(aWeight);
        name = aName;
    }

    //additional constructors
    public HouseCat(String name) {
        this.name = name;
    }

    public HouseCat(double aWeight) { //bad example of constructor,
        super(aWeight);              //doesn't initialize essential field, NAME
    }

    public boolean isSatisfied() {
        return !isHungry() && !isTired();
    }

    @Override
    public String noise() {
        if(isSatisfied()) {return "Hello, my name is " + name + "!";
        } else {
            return "Hrrrumph";
        }
//        return noise();
    }

    public String purr() {
        return "I'm a HouseCat";
    }
}
