package com.zipcodewilmington.froilansfarm;

public class Tractor extends FarmVehicle {
    String noise = "chugachuga";
    boolean mounted = false;

    public void harvest(Croprow croprow) {
        croprow.harvestCrop();
    }

    public boolean isMounted() {
        return mounted;
    }

    public void isRidden(Person person) {

    }

    public void setMounted(boolean isMounted) {
        mounted = isMounted;
    }

    public String makeNoise() {
        return noise;
    }
}
