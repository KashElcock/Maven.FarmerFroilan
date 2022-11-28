package com.zipcodewilmington.froilansfarm.WeekOnTheFarm;

import com.zipcodewilmington.froilansfarm.*;
import com.zipcodewilmington.froilansfarm.Shelter.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class WednesdayTest {
    @Test
    public void testDay(){
        //given this setup
        MainApplication main = new MainApplication();
        Farm farm = main.setUpFarm();
        FarmHouse house = farm.getFarmhouse();
        Farmer froilan = (Farmer) house.get(0);
        Pilot<Farmer> froilanda = (Pilot<Farmer>) house.get(1);

        //when a day is simulated
        EarCorn[] horseMealExpected = {new EarCorn(), new EarCorn(), new EarCorn()};
        for (Stable stable: farm.getStables()
             ) {
            stable.feedHorses(horseMealExpected);
        }
        for(Stable stable: farm.getStables()){
            for (Horse horse: stable
                 ) {
                froilan.mount(horse);
                froilan.disMount(horse);
                froilanda.mount(horse);
            }
        }
        Edible[] expected1 = {new EarCorn(),new TomatoPlant(), new TomatoPlant(),
                new EdibleEgg(), new EdibleEgg(), new EdibleEgg(), new EdibleEgg(), new EdibleEgg()};
        house.feedHouseMember(froilan,expected1);
        Edible[] expected2 = {new EarCorn(), new EarCorn(), new TomatoPlant(),
                new EdibleEgg(), new EdibleEgg()};
        house.feedHouseMember(froilanda,expected2);

        //then test Farmhouse was fed
        Assert.assertArrayEquals(expected1,froilan.getFoodEaten().toArray());
        Assert.assertArrayEquals(expected2,froilanda.getFoodEaten().toArray());
        //test horses were fed
        for (Stable stable: farm.getStables()
             ) {
            for (Horse horse: stable
                 ) {
                Assert.assertArrayEquals(horseMealExpected,horse.getFoodEaten().toArray());
            }
        }
        //test horses were rode
        for (Stable stable: farm.getStables()
             ) {
            for (Horse horse: stable
                 ) {
                Assert.assertTrue(horse.isMounted());
            }
        }
    }
}
