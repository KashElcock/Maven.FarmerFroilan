package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class CropDusterTest {

    @Test
    public void testCropDuster() {
        Pilot pilot = new Pilot();
        CropDuster cd = new CropDuster();
        Croprow croprow = new Croprow();

        pilot.mount(cd);
        cd.fertilize(croprow);

        Assert.assertTrue(cd.mounted);
        Assert.assertEquals("One small step for man...", pilot.makeNoise());
        Assert.assertEquals("zoom, zoom, zoom", cd.makeNoise());
        Assert.assertTrue(cd instanceof AirCraft);

        Pilot p2 = new Pilot();
        p2.mount(cd);
        pilot.disMount(cd);
    }

    @Test
    public void testIfElse() {
        Pilot pilot = new Pilot();
        CropDuster cd = new CropDuster();
        Croprow croprow = new Croprow();
//        Pilot<Farmer> froilanda = new Pilot<Farmer>();
//        Horse horse = new Horse();
//
//        froilanda.mount(horse);
//        froilanda.disMount(horse);

        cd.fertilize(croprow);
        cd.setMounted(true);
        pilot.disMount(cd);
    }
}
