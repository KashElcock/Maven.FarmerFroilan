package com.zipcodewilmington.froilansfarm.Shelter;

import com.zipcodewilmington.froilansfarm.*;

import java.util.ArrayList;
import java.util.List;

public class ChickenCoop extends Shelter<Chicken> {
    public ChickenCoop() {
    }

    public void fill(int numToFill) {
        for (int i = 1; i <= numToFill; i++) {
            this.add(new Chicken());
        }
    }

    public List<EdibleEgg> gatherEggs() {
        List<EdibleEgg> yieldEggs = new ArrayList<EdibleEgg>();
        for (Chicken chicken: this
             ) {
            if(chicken.yield() instanceof EdibleEgg) yieldEggs.add((EdibleEgg) chicken.yield());
        }
        return yieldEggs;
    }

    public void feedChickens(Edible... edibles) {
        for (Chicken chicken: this
             ) {
            for (Edible food: edibles
                 ) {
                chicken.eat(food);
            }
        }
    }
}
