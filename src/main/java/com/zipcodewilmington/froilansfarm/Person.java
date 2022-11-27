package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public abstract class Person implements Eater<Edible>, NoiseMaker{
    private List<Edible> foodEaten = new ArrayList();

    public List<Edible> getFoodEaten() {
        return foodEaten;
    }

    public void eat(Edible edible){
        foodEaten.add(edible);
    }
}
