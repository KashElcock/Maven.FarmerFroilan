package com.zipcodewilmington.froilansfarm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HorseTest {
    @Test
    public void setterTest(){
        //given a chicken and the name
        String expected = "Spirit";
        //when: we set the name
        Horse horse = new Horse();
        horse.setName(expected);
        String actual = horse.getName();
        //then the chicken do what it do
        assertEquals(expected,actual);
    }
    @Test
    public void makeNoise(){
        //given: a chicken
        Horse horse = new Horse();
        //when: you tell it to make noise
//        String expected = "whinny";
//        String actual = horse.makeNoise();
        //then: it whinnies
//        assertEquals(expected, actual);
    }
    @Test
    public void isMountedTest(){
//        //given: a horse and a farmer
//        Horse horse = new Horse();
//        Farmer farmer = new Farmer();
//        //when: a farmer rides it
//        Boolean actual = horse.isMounted();
//        //then: then isMounted returns true
    }
    @Test
    public void eatTest(){
        //given a horse
        //when he eats edible corn
        //then the cropyield should go down
    }
}
