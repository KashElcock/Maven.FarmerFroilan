package com.zipcodewilmington.froilansfarm;

public class Tractor extends FarmVehicle {
    String noise = "chugachuga";
    boolean mounted = false;

    public void harvest(Croprow croprow) {
        //harvest crop in croprow
    }

    public boolean isMounted() {
        return mounted;
    }

    public void setMounted(boolean isMounted) {
        mounted = isMounted;
    }

    public String makeNoise() {
        return noise;
    }
}
