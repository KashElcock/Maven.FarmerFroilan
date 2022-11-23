package com.zipcodewilmington.froilansfarm;

public class CropDuster extends FarmVehicle implements AirCraft {
    boolean mounted = false;
    String noise = "zoom, zoom, zoom";
    Pilot pilot;

    public void mount(Pilot pilot) {
        if (!mounted) {
            this.pilot = pilot;
            mounted = true;
        }
    }

    public void fertilize(Croprow cropRow) {

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
