package com.zipcodewilmington.froilansfarm;

import junit.framework.TestCase;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class TomatoPlantTest extends TestCase {

    public void testYield() {

        TomatoPlant tp = new TomatoPlant();
        tp.yield();
        Assert.assertNotNull(tp.yield());
    }

    public void testIsEdible() {
        TomatoPlant tp = new TomatoPlant();
        tp.isEdible();
        Assert.assertEquals(true,tp.isEdible());
    }
}