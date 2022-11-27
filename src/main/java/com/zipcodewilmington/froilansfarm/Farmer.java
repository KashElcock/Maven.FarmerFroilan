package com.zipcodewilmington.froilansfarm;

public class Farmer extends Person implements Rider<Rideable,Horse>, Botanist{
    String noise = "YeeHaw!";

    public void plant(Crop crop, Croprow croprow) {
        croprow.plantCrop(crop);
    }

    public String makeNoise() {
        return noise;
    }

    public void mount(Rideable rideable) {
        if (rideable.isMounted()) {
            System.out.println("Papaw already took the tractor out, you lazy bum!");
        }
        else {
            rideable.setMounted(true);
        }
    }

    public void disMount(Rideable rideable) {
        if (rideable.isMounted()) {
            rideable.setMounted(false);
        }
    }
}
