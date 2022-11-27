package com.zipcodewilmington.froilansfarm.TestShelter;

import com.zipcodewilmington.froilansfarm.*;
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
    @Test
    public void testFeedHouseMember(){
        //given
        Person p = new Farmer();
        Person p2 = new Pilot<Person>();
        FarmHouse house = new FarmHouse();
        house.add(p);
        house.add(p2);
        //when
        house.feedHouseMember(p,new EdibleEgg(),new EarCorn());
        house.feedHouseMember(p2, new EarCorn(), new TomatoPlant());
        //then
        Assert.assertEquals(2,p.getFoodEaten().size());
        Assert.assertEquals(2,p2.getFoodEaten().size());
    }
}
