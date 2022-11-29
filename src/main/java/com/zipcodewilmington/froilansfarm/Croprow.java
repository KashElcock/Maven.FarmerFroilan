package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class Croprow <T extends Crop> extends ArrayList<T> {

    private T crop;
    public boolean fertilized = false;

    public Croprow(){
    }

    public Crop getCrop() {
        return crop;
    }

    public void fertilize() {
        this.fertilized = true;
    }
    public boolean isFertilized() {
        return fertilized;
    }

    public void plantCrop(T crop){
        this.crop = crop;
    }

    public void harvestCrop(){
        if (fertilized) {
            crop.yield();
            crop = null;
        }
        System.out.println("You can't harvest the crop until it has been fertilized.");
    }

    public void plowCrop(){
        crop = null;
    }
}

