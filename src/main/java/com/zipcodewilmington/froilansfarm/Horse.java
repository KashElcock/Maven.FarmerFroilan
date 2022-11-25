package com.zipcodewilmington.froilansfarm;

//implements Eater
public class Horse implements Rideable, Animal{
    Boolean mounted = false;
    String name;

    public boolean isMounted() {
        return mounted;
    }

    public void setMounted(boolean isMounted) {mounted = isMounted;}

    public String makeNoise() {
        return "Whinny";
    }

    public void eat(Crop corn){

    }

    public void eat(Edible crop) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
