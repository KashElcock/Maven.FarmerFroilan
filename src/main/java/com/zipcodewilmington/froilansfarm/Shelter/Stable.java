package com.zipcodewilmington.froilansfarm.Shelter;

import com.zipcodewilmington.froilansfarm.EarCorn;
import com.zipcodewilmington.froilansfarm.Horse;

public class Stable extends Shelter<Horse> {
    public Stable() {
    }

    public void feedHorses(EarCorn... earCorns) {
        for (Horse horse: this
             ) {
            for (EarCorn earCorn: earCorns
                 ) {
                horse.eat(earCorn);
            }
        }
    }
}
