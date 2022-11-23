package com.zipcodewilmington.froilansfarm;

public class Tractor extends FarmVehicle {
    Farmer farmer;
    String noise = "chugachuga";
    boolean mounted = false;

    public void mount(Farmer farmer) {
        if (!mounted) {
            this.farmer = farmer;
            mounted = true;
        }
    }

    public void harvest(Croprow cropRow) {

    }

    public boolean isMounted() {
        return mounted;
    }

    public void setMounted(boolean isMounted) {

    }

    public Farmer getFarmer() {
        return farmer;
    }

    public String makeNoise() {
        return noise;
    }
}
