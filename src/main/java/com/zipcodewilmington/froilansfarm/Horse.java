package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

//implements Eater
public class Horse implements Rideable, Animal{
    Boolean mounted = false;
    String name;
    List<Edible> foodEaten = new ArrayList<Edible>();

    public boolean isMounted() {
        return mounted;
    }

    public void setMounted(boolean isMounted) {mounted = isMounted;}

    public String makeNoise() {
        return "Whinny";
    }
    public List<Edible> getFoodEaten(){
        return foodEaten;
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
}
