package com.zipcodewilmington.froilansfarm.WeekOnTheFarm;

import com.zipcodewilmington.froilansfarm.*;
import com.zipcodewilmington.froilansfarm.Shelter.Shelter;
import com.zipcodewilmington.froilansfarm.Shelter.Stable;
import org.junit.Test;

import java.awt.*;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ThursdayTest {
    //given the whole farm
    MainApplication main = new MainApplication();
    Farm farm = main.setUpFarm();
    Farmer froilan = new Farmer();
    Pilot<Farmer> froilanda = new Pilot();
    Edible corn = new EarCorn();
    Edible tomato = new Tomato();
    Edible egg = new EdibleEgg();
    @Test
    public void testHumansRidingEachHorse(){
        //given a stable full of horses
        for (Stable stable : farm.getStables()){
            for(Horse horse : stable){
                froilanda.mount(horse);
                froilanda.disMount(horse);
                froilan.mount(horse);
                assertTrue(horse.isMounted());
            }
        }
    }

    @Test
    public void testFeedingEachHorse(){
        
            for (Stable stable : farm.getStables()) {
                for (Horse horse : stable) {
                    horse.eat(corn);
                    if (horse.getFoodEaten().size() > 3){
                        EarCorn [] expected = {new EarCorn(), new EarCorn(), new EarCorn()};
                        assertArrayEquals(horse.getFoodEaten().toArray(), expected);
                        break;
                    }
                }
            }
    }

    @Test
    public void testFroilanEating(){
        //then Froilan eats 1 earcorn 2 tomato and 5 eggs
//        Edible[] expected = {new EarCorn(), new Tomato(), new Tomato(), new EdibleEgg(),
//                new EdibleEgg(),new EdibleEgg(),new EdibleEgg(),new EdibleEgg()};
//        Edible[] toEat = {new EarCorn(), new Tomato(), new Tomato(), new EdibleEgg(),
//                new EdibleEgg(),new EdibleEgg(),new EdibleEgg(),new EdibleEgg()};
//        for (Edible food : toEat){
//            froilan.eat(food);
//        }
//        assertArrayEquals(expected, froilan.getFoodEaten().toArray());
    }

    @Test
    public void testFroilandaEating(){
        //froilanda eats 2 earcorn, 1 tomato and 2 eggs
//        Edible[] expected = {new EarCorn(), new EarCorn(), new Tomato(), new EdibleEgg(),
//                new EdibleEgg()};
//        assertArrayEquals(froilanda.getFoodEaten().toArray(), expected);
    }
}
