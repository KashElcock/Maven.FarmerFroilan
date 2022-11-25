package com.zipcodewilmington.froilansfarm;

public class TomatoPlant extends Crop <Tomato>{

    public TomatoPlant(){
        super(false);
    }

    @Override
    public Tomato yield(){
        return  new Tomato();
    }

    public boolean isEdible() {
        return true;
    }
}

