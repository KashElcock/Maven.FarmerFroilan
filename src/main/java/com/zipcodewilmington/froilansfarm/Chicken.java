package com.zipcodewilmington.froilansfarm;

public class Chicken extends Produce implements Animal{
    //not fertilized egg adds to population of chicken
    //fertilized egg turns to edible object

    String name;
    public void layEgg(){}
    public void yieldEgg(){}


    public String makeNoise() {
        return "Cluck";
    }


    public void eat(Edible crop) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEdible() {
        return false;
    }

    public Edible yield() {
        return null;
    }
}
//chicken can eat edibles of type corn and make noise "cluck"