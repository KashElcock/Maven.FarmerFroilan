package com.zipcodewilmington.froilansfarm;

public class Croprow <T extends Crop>{

    private T crop;
    boolean fertilized = false;

    public Croprow(){
    }

    public T getCrop() {
        return crop;
    }

    public void fertilize() {
        this.fertilized = true;
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

