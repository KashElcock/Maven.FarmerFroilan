package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class FarmerTest {

    @Test
    public void testFarmer() {
        //Given
        Croprow cr = new Croprow();
        CarrotPlant cp = new CarrotPlant();
        Farmer farmer = new Farmer();
        Tractor tractor = new Tractor();

        //test mounting tractor
        farmer.mount(tractor);
        //test mounting mounted tractor
        farmer.mount(tractor);

        //test crop planted
        farmer.plant(cp, cr);
        Assert.assertEquals(cp, cr.getCrop());
        Assert.assertEquals("YeeHaw!", farmer.makeNoise());
    }
}
