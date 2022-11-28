package com.zipcodewilmington.froilansfarm;

public class CropDuster extends AirCraft<Pilot<Person>> {
    boolean mounted = false;
    String noise = "zoom, zoom, zoom";

    public boolean fertilize(Croprow croprow) {
        if (mounted) {
            croprow.fertilize();
            return true;
        }
        else {
            System.out.println("There is no one in the plane!");
        }
        return false;
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
