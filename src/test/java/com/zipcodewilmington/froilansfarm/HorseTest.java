package com.zipcodewilmington.froilansfarm;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

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
        assertEquals(expected, actual);
    }
    @Test
    public void makeNoise(){
        //given: a chicken
        Horse horse = new Horse();
        //when: you tell it to make noise
        String expected = "Whinny";
        String actual = horse.makeNoise();
        //then: it whinnies
        assertEquals(expected, actual);
    }
    @Test
    public void isMountedTest(){
        //given: a horse and a farmer
        Horse horse = new Horse();
        Farmer farmer = new Farmer();
        //when: a farmer rides it
        farmer.mount(horse);
        Boolean actual = horse.isMounted();
        //then: then isMounted returns true
        assertTrue(actual);
    }
    @Test
    public void isMountedTest1(){
        //given: a horse and a farmer
        Horse horse = new Horse();
        Farmer farmer = new Farmer();
        //when: a farmer dismounts
        farmer.disMount(horse);
        Boolean actual = horse.isMounted();
        //then: then isMounted returns false
        assertFalse(actual);
    }
    @Test
    public void eatTest(){
        //given a horse and harvested cornstalks
        Horse horse = new Horse();
        //when he eats edible corn
        Edible earCorn = new EarCorn();
        horse.eat(earCorn);
        horse.eat(earCorn);
        //then the food he ate gets added to a list
        assertTrue(horse.getFoodEaten().size() == 2);
    }
}
