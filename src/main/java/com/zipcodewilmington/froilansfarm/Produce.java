package com.zipcodewilmington.froilansfarm;

public abstract class Produce implements Edible {

    private boolean hasBeenFertilized;

    public Produce(){
        hasBeenFertilized = false;
    }

    public boolean getHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public abstract Edible yield();

}
