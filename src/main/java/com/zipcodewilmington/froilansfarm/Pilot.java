package com.zipcodewilmington.froilansfarm;

public class Pilot extends Person implements Rider<AirCraft> {
    String noise = "One small step for man...";

    public Pilot() {
    }

    public String makeNoise() {
        return noise;
    }

    public void mount(AirCraft airCraft) {
        if (airCraft.isMounted()) {
            System.out.println("Amelia already took out the plane.");
        }
        else {
            airCraft.setMounted(true);
        }
    }

    public void disMount(AirCraft airCraft) {
        airCraft.setMounted(false);
    }
}
