package com.zipcodewilmington.froilansfarm.WeekOnTheFarm;

import com.zipcodewilmington.froilansfarm.*;
import com.zipcodewilmington.froilansfarm.Shelter.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Shelter.Farm;
import com.zipcodewilmington.froilansfarm.Shelter.FarmHouse;
import com.zipcodewilmington.froilansfarm.Shelter.Stable;
import org.junit.Test;

public class WednesdayTest {
    Farm farmMcFroilan = new Farm();
    Farmer froilan = new Farmer();
    Pilot friolanda = new Pilot();
    CropDuster cropDuster = new CropDuster();
    Tractor tractor = new Tractor();
    Stable stable1 = new Stable();
    Stable stable2 = new Stable();
    Stable stable3 = new Stable();
    ChickenCoop coop1 = new ChickenCoop();
    ChickenCoop coop2 = new ChickenCoop();
    ChickenCoop coop3 = new ChickenCoop();
    ChickenCoop coop4 = new ChickenCoop();
    FarmHouse house = new FarmHouse();

    @Test
    public void testDay(){
        house.add(friolanda);
        house.add(froilan);
        stable1.fill(4);
        stable2.fill(3);
        stable3.fill(3);
        coop1.fill(4);
        coop2.fill(4);
        coop3.fill(4);
        coop4.fill(3);
        for (Horse horse: stable1
             ) {
            froilan.mount(horse);
            friolanda.mount(horse);
        }
        for (Horse horse: stable2
             ) {
            froilan.mount(horse);
            friolanda.mount(horse);
        }
        for (Horse horse: stable3
             ) {
            froilan.mount(horse);
            friolanda.mount(horse);
        }
        stable1.feedHorses(new EarCorn(), new EarCorn(), new EarCorn());
        stable2.feedHorses(new EarCorn(), new EarCorn(), new EarCorn());
        stable3.feedHorses(new EarCorn(), new EarCorn(), new EarCorn());
        house.feedHouseMember(froilan,new EarCorn(),new TomatoPlant(), new TomatoPlant(),
                new EdibleEgg(), new EdibleEgg(), new EdibleEgg(), new EdibleEgg(), new EdibleEgg());
        house.feedHouseMember(friolanda, new EarCorn(), new EarCorn(), new TomatoPlant(),
                new EdibleEgg(), new EdibleEgg());
    }
}
