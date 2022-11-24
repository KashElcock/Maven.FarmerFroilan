package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class TractorTest {
    @Test
    public void testTractor() {
        Tractor tractor = new Tractor();
        Farmer farmer = new Farmer();
        Croprow cropRow = new Croprow();

        farmer.mount(tractor);
        tractor.harvest(cropRow);

        Assert.assertTrue(tractor.isMounted());
        Assert.assertEquals("chugachuga", tractor.makeNoise());
        Assert.assertTrue(tractor instanceof FarmVehicle);
        farmer.disMount(tractor);
    }
}
