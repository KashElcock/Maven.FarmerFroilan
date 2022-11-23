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

    public void harvest(CropRow cropRow) {

    }

    public boolean isMounted() {
        return mounted;
    }

    public Farmer getFarmer() {

    }
}
