package com.zipcodewilmington.froilansfarm;

import junit.framework.TestCase;
import org.junit.Assert;

public class CarrotPlantTest extends TestCase {

    public void testYield() {
        CarrotPlant cp = new CarrotPlant();
        cp.yield();
        System.out.println(cp.yield());
        Assert.assertNotNull(cp.yield());
    }

    public void testIsEdible() {
        CarrotPlant cp = new CarrotPlant();
        cp.isEdible();
        Assert.assertEquals(true,cp.isEdible());

    }
}