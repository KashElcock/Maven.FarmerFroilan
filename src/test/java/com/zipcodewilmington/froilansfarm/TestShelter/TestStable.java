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
        //given
        Stable stable = new Stable();
        Horse horse1 = new Horse();
        Horse horse2 = new Horse();
        stable.add(horse1);
        stable.add(horse2);
        //when
        stable.feedHorses(new EarCorn(), new EarCorn(), new EarCorn());
        //then
        Assert.assertEquals(horse1.getFoodEaten().size(),3);
        Assert.assertEquals(horse2.getFoodEaten().size(),3);
    }

    @Test
    public void testFeedHorses_oneEar(){
        //given
        Stable stable = new Stable();
        Horse horse1 = new Horse();
        Horse horse2 = new Horse();
        stable.add(horse1);
        stable.add(horse2);
        //when
        stable.feedHorses(new EarCorn());
        //then
        Assert.assertEquals(horse1.getFoodEaten().size(),1);
        Assert.assertEquals(horse2.getFoodEaten().size(),1);
    }


}
