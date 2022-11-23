package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class TractorTest {
    @Test
    public void testTractor() {
        Tractor tractor = new Tractor();
        Farmer farmer = new Farmer();
        Croprow cropRow = new Croprow();

        tractor.mount(farmer);

        tractor.harvest(cropRow);

        Assert.assertTrue(tractor.isMounted());
        tractor.setMounted(false);
        Assert.assertFalse(tractor.isMounted());

        Farmer f1 = tractor.getFarmer();

        Assert.assertEquals("chugachuga", tractor.makeNoise());
    }
}
