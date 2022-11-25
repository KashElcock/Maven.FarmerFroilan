package com.zipcodewilmington.froilansfarm.TestShelter;

import com.zipcodewilmington.froilansfarm.Shelter.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Shelter.Shelter;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestChickenCoop {
    @Test
    public void testConstructor(){
        //given
        ChickenCoop coop = new ChickenCoop();
        Assert.assertTrue(coop instanceof Shelter);
        Assert.assertTrue(coop instanceof ArrayList);
    }

}
