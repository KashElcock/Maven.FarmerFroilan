package com.zipcodewilmington.froilansfarm;

import junit.framework.TestCase;
import org.junit.Assert;

public class CropTest extends TestCase {

    public void testIsHasBeenHarvested() {
        TomatoPlant tp = new TomatoPlant();

        tp.setHasBeenHarvested(true);
        Assert.assertEquals(true,tp.isHasBeenHarvested());
    }

    public void testSetHasBeenHarvested() {
        TomatoPlant tp = new TomatoPlant();

        tp.setHasBeenHarvested(true);
        Assert.assertEquals(true,tp.isHasBeenHarvested());
    }
    public void testSetHasBeenHarvested1() {
        TomatoPlant tp = new TomatoPlant();

        tp.setHasBeenHarvested(false);
        Assert.assertEquals(false,tp.isHasBeenHarvested());
    }
    public void testIsHasBeenHarvested1() {
        TomatoPlant tp = new TomatoPlant();

        tp.setHasBeenHarvested(false);
        Assert.assertEquals(false,tp.isHasBeenHarvested());
    }
}