package com.zipcodewilmington.froilansfarm.TestShelter;

import com.zipcodewilmington.froilansfarm.Chicken;
import com.zipcodewilmington.froilansfarm.EarCorn;
import com.zipcodewilmington.froilansfarm.EdibleEgg;
import com.zipcodewilmington.froilansfarm.Horse;
import com.zipcodewilmington.froilansfarm.Shelter.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Shelter.Shelter;
import com.zipcodewilmington.froilansfarm.Shelter.Stable;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestChickenCoop {
    @Test
    public void testConstructor(){
        //given
        ChickenCoop coop = new ChickenCoop();
        Assert.assertTrue(coop instanceof Shelter);
        Assert.assertTrue(coop instanceof ArrayList);
    }

    @Test
    public void testFeedChickens(){
        //given
        ChickenCoop coop = new ChickenCoop();
        Chicken chicken1 = new Chicken();
        Chicken chicken2 = new Chicken();
        coop.add(chicken1);
        coop.add(chicken2);
        //when
        coop.feedChickens(new EarCorn(), new EarCorn(), new EarCorn());
        //then
        Assert.assertEquals(chicken1.getFoodEaten().size(),3);
        Assert.assertEquals(chicken2.getFoodEaten().size(),3);
    }

    @Test
    public void  testGatherEggs(){
        //given
        ChickenCoop coop = new ChickenCoop();
        Chicken chicken1 = new Chicken();
        Chicken chicken2 = new Chicken();
        coop.add(chicken1);
        coop.add(chicken2);
        //when
        List<EdibleEgg> actual = coop.gatherEggs();
        int expected = 2;
        //then
        Assert.assertEquals(expected,actual.size());
    }

    @Test
    public void  testGatherEggs_mixedFertilization(){
        //given
        ChickenCoop coop = new ChickenCoop();
        Chicken chicken1 = new Chicken();
        Chicken chicken2 = new Chicken();
        chicken2.setHasBeenFertilized(true);
        coop.add(chicken1);
        coop.add(chicken2);
        //when
        List<EdibleEgg> actual = coop.gatherEggs();
        int expected = 1;
        //then
        Assert.assertEquals(expected,actual.size());
    }

}
