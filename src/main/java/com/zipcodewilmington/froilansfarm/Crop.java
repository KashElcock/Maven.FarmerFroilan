package com.zipcodewilmington.froilansfarm;

public abstract class Crop <T> extends Produce {

    private boolean hasBeenHarvested;
    T hasBeenFertilized;

    public Crop(boolean hasBeenHarvested) {
        super();
        this.hasBeenHarvested = hasBeenHarvested;
    }

    public boolean isHasBeenHarvested() {
        return hasBeenHarvested;
    }

    public void setHasBeenHarvested(boolean hasBeenHarvested) {
        this.hasBeenHarvested = hasBeenHarvested;
    }
}
