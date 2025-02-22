package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class Chicken extends Produce implements Animal{
    //not fertilized egg adds to population of chicken
    //fertilized egg turns to edible object
    String name;
    int amountOfEggs;
    List<Edible> foodEaten = new ArrayList<Edible>();
    List<Chicken> chickens = new ArrayList();
    int egg;

    public Chicken(){
        super();
    }
    public Edible yield(){
        if(!getHasBeenFertilized()){
            return new EdibleEgg();
        } else {
            return new Chicken();
        }

    }
    public List<Edible> getFoodEaten(){
        return foodEaten;
    }



    public String makeNoise() {
        return "Cluck cluck";
    }

    public void makeChickens(int amountOfChickens){
        for (int i = 0; i < amountOfChickens; i++){
            chickens.add(new Chicken());
        }
    }

    public int getAmountOfChickens() {
        return chickens.size();
    }

    public List<Chicken> getChickens() {
        return chickens;
    }

    public void eat(Edible crop) {
        foodEaten.add(crop);
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