package com.zipcodewilmington.froilansfarm.TestShelter;

import com.zipcodewilmington.froilansfarm.EarCorn;
import com.zipcodewilmington.froilansfarm.Horse;
import com.zipcodewilmington.froilansfarm.Shelter.Shelter;
import com.zipcodewilmington.froilansfarm.Shelter.Stable;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestStable {

    @Test
    public void testConstructor(){
        //given
        Stable stable  = new Stable();
        Assert.assertTrue(stable instanceof Shelter);
        Assert.assertTrue(stable instanceof ArrayList);
    }
    @Test
    public void testFeedHorses(){
        Stable stable = new Stable();
        Horse horse1 = new Horse();
        Horse horse2 = new Horse();
        stable.add(horse1);
        stable.add(horse2);
        stable.feedHorses(new EarCorn(), new EarCorn(), new EarCorn());

    }

}
