package com.zipcodewilmington.froilansfarm;

//implements NoiseMaker, Eater
interface Animal extends NoiseMaker, Eater{

//    Animal is now an interface so chicken can extend produce instead.

    String getName();

    void setName(String name);
}
