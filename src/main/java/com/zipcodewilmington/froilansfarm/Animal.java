package com.zipcodewilmington.froilansfarm;

//implements NoiseMaker, Eater
public abstract class Animal implements NoiseMaker{
    String name;
//    public Animal(String name){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
