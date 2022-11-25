package com.zipcodewilmington.froilansfarm.Shelter;

import com.zipcodewilmington.froilansfarm.Edible;

import java.util.ArrayList;
import java.util.List;

public class FarmStand {

    private double moneyJar = 0;
    private List<Edible> basket;


    public FarmStand() {
        basket = new ArrayList<Edible>();
    }

    public void sell(List<Edible> ediblesSold, List<Edible> basket) {
        basket.removeAll(ediblesSold);
        moneyJar += (ediblesSold.size() * 1);
    }

    public double getMoneyJar() {
        return moneyJar;
    }


    public List<Edible> getBasket() {
        return basket;
    }

    public void addToBasket(Edible e){
        basket.add(e);
    }
}
