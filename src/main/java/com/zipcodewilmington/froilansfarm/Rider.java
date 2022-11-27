package com.zipcodewilmington.froilansfarm;

public interface Rider <Rideable,T> {
    void mount( Rideable rideable);
    void disMount(Rideable rideable);

}
