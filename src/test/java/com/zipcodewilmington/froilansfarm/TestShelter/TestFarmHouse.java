package com.zipcodewilmington.froilansfarm.TestShelter;

import com.zipcodewilmington.froilansfarm.Farmer;
import com.zipcodewilmington.froilansfarm.Person;
import com.zipcodewilmington.froilansfarm.Shelter.FarmHouse;
import com.zipcodewilmington.froilansfarm.Shelter.Shelter;
import org.junit.Assert;
import org.junit.Test;

public class TestFarmHouse {
    @Test
    public void testConstructor(){
        //given
        FarmHouse house = new FarmHouse();
        Assert.assertTrue(house instanceof Shelter);
    }
}
