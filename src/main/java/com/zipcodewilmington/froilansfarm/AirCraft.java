package com.zipcodewilmington.froilansfarm;

public interface AirCraft extends Vehicle<Pilot> {
    boolean mounted = false;

    void mount(Pilot pilot);

    void fertilize(CropRow cropRow);
}
