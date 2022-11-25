package com.zipcodewilmington.froilansfarm;

public class CarrotPlant extends Crop <Carrot>{
    public CarrotPlant() {
        super(false);
    }

    public Carrot yield() {
        return null;
    }

    public boolean isEdible() {
        return true;
    }
}