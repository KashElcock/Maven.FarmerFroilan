package com.zipcodewilmington.froilansfarm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class ChickenTest {
    Chicken chicken = new Chicken();
//    Egg egg = new Egg();
    @Test
    public void setterTest(){
        //given a chicken and the name
        String expected = "Billy Hatcher";
        //when: we set the name
        Chicken chicky = new Chicken();
        chicky.setName(expected);
        String actual = chicky.getName();
        //then the chicken do what it do
        assertEquals(expected,actual);
    }
    @Test
    public void makeNoiseTest(){
        //given: a chicken
        //when: you tell it to make noise
        String expected = "Cluck cluck";
        String actual = chicken.makeNoise();
        //then: it clucks
        assertEquals(expected, actual);
    }
    @Test
    public void layEggTest(){
        //given a chicken
        //when it lays an egg
//        chicken.layEgg();
//        Integer actual = egg.getAmountOfEggs();
        //then it increases the amount of unfertilized eggs
//        assertTrue(actual > 0);

    }
    @Test
    public void yieldTest(){
        //given a fertilized chicken
        chicken.setHasBeenFertilized(true);
        //when you call the method
        //then test to see if it is an instance of chicken
        assertTrue(chicken.yield() instanceof Chicken);
    }
    @Test
    public void yieldTest1(){
        //given a fertilized chicken
        chicken.setHasBeenFertilized(false);
        //when you call the method
        //then test to see if it is an instance of chicken
        assertTrue(chicken.yield() instanceof EdibleEgg);
    }

    @Test
    public void eatTest(){
        //given a horse and harvested cornstalks
        //when he eats edible corn
        Edible earCorn = new EarCorn();
        chicken.eat(earCorn);
        chicken.eat(earCorn);
        chicken.eat(earCorn);
        //then the food he ate gets added to a list
        assertTrue(chicken.getFoodEaten().size() == 3);
    }
}
