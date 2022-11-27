package com.zipcodewilmington.froilansfarm;

public class CropDuster extends AirCraft<Pilot> {
    boolean mounted = false;
    String noise = "zoom, zoom, zoom";

    public void fertilize(Croprow croprow) {
        if (mounted) {
            croprow.fertilize();
        }
        else {
            System.out.println("There is no one in the plane!");
        }
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
