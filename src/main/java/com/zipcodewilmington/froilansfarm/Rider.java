package com.zipcodewilmington.froilansfarm;

public interface Rider <T extends Rideable> {
    void mount(Rideable rideable);
    void disMount(Rideable rideable);

}
