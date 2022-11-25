package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class Chicken extends Produce implements Animal{
    //not fertilized egg adds to population of chicken
    //fertilized egg turns to edible object
    String name;
    int amountOfEggs;
    int amountOfChickens;
    List<Edible> foodEaten = new ArrayList<Edible>();
    int egg;

    public Chicken(){
        super();
    }
    public Edible yield(){
//        if(!getHasBeenFertilized()){
//            return new EdibleEgg();
//        } else {
//            return ;
//        }
        return new EdibleEgg();
    }
    public List<Edible> getFoodEaten(){
        return foodEaten;
    }

    public void layEgg(){}



    public String makeNoise() {
        return "Cluck cluck";
    }

    public static List<Chicken> makeChickens(int amountOfChickens){
        List<Chicken> chickens = new ArrayList<Chicken>();
        for (int i = 0; i <= amountOfChickens; i++){
            chickens.add(new Chicken());
        }
        return chickens;
    }


    public void eat(Edible crop) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAmountOfEggs() {
        return amountOfEggs;
    }

    public void setAmountOfEggs(int amountOfEggs) {
        this.amountOfEggs = amountOfEggs;
    }

    public boolean isEdible() {
        return true;
    }
}
//chicken can eat edibles of type corn and make noise "cluck"

//my confusion is, where are chickens getting fertilized...
//or are eggs getting fertilized?
//also the amount of chickens that go in the coop are dependent on the amount of
//edible eggs. if an egg is not edible then it is a chicken. Yielded eggs are edible eggs.
//also does each chicken just lay one egg?