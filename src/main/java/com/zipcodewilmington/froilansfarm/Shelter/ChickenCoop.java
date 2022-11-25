package com.zipcodewilmington.froilansfarm.Shelter;

import com.zipcodewilmington.froilansfarm.Chicken;
import com.zipcodewilmington.froilansfarm.EarCorn;
import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.EdibleEgg;

import java.util.ArrayList;
import java.util.List;

public class ChickenCoop extends Shelter<Chicken> {
    public ChickenCoop() {
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
