package com.zipcodewilmington.froilansfarm;

import junit.framework.TestCase;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class ProduceTest extends TestCase {

    public void testGetHasBeenFertilized() {

       TomatoPlant tp = new TomatoPlant();

         tp.setHasBeenFertilized(true);
        Assert.assertEquals(true,tp.getHasBeenFertilized());
    }

    public void testSetHasBeenFertilized() {

        TomatoPlant tp = new TomatoPlant();

        tp.setHasBeenFertilized(true);
        Assert.assertEquals(true,tp.getHasBeenFertilized());
    }

}