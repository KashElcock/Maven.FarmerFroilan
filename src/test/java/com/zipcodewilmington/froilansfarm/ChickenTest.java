package com.zipcodewilmington.froilansfarm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ChickenTest {
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
    public void makeNoise(){
        //given: a chicken
        Chicken chicken = new Chicken();
        //when: you tell it to make noise
//        String expected = "cluck";
//        String actual = chicken.makeNoise();
        //then: it clucks
//        assertEquals(expected, actual);
    }
}
