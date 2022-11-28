package com.zipcodewilmington.froilansfarm;

public class Pilot<F extends Person> extends Person implements Rider<AirCraft>{
    String noise = "One small step for man...";

    public Pilot() {
    }

    public String makeNoise() {
        return noise;
    }

    public void mount(Horse horse) {
        if (horse.isMounted()) {
            System.out.println("Horse already mounted.");
        }
        else {
            horse.setMounted(true);
        }
    }

    public void disMount(Horse horse) {
        horse.setMounted(false);
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

    public void mount(Rideable rideable) {

    }

    public void disMount(Rideable rideable) {

    }
}
