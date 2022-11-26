package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public abstract class Person implements Eater<Edible>, NoiseMaker{
    private List<Edible> foodEaten = new ArrayList<Edible>();

    public List<Edible> getFoodEaten() {
        return foodEaten;
    }

    public void setFoodEaten(List<Edible> foodEaten) {
        this.foodEaten = foodEaten;
    }

    public void eat(Edible edible){
        foodEaten.add(edible);
    }
}
