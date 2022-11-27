package com.zipcodewilmington.froilansfarm;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class CroprowTest extends TestCase {

    @Test
    public void testGetCrops() {
        Croprow cr = new Croprow();
        TomatoPlant tp = new TomatoPlant();

        cr.plantCrop(tp);
        System.out.println(cr.getCrop());
        Assert.assertNotNull(cr.getCrop());

        Assert.assertSame(tp,cr.getCrop());
    }

    @Test
    public void testPlantCrop1() {

    Croprow cr1 = new Croprow();
    Croprow cr2 = new Croprow();
    Croprow cr3 = new Croprow();
    TomatoPlant tp = new TomatoPlant();
    CornStalk cs = new CornStalk();
    CarrotPlant cp = new CarrotPlant();

    cr1.plantCrop(tp);
    cr2.plantCrop(cs);
    cr3.plantCrop(cp);

    tp.setHasBeenFertilized(true);
    System.out.println(tp.getHasBeenFertilized());

    System.out.println(tp.isEdible());

    System.out.println(tp.yield());

    tp.setHasBeenHarvested(true);
    System.out.println(tp.isHasBeenHarvested());

    cr1.plowCrop();
    System.out.println(cr1.getCrop());

    Assert.assertEquals(null, cr1.getCrop());

    }
    @Test
    public void testPlantCrop() {
        Croprow cr = new Croprow();
        CarrotPlant cp = new CarrotPlant();

        cr.plantCrop(cp);

        Assert.assertNotNull(cr.getCrop());
    }

    public void testHarvestCrop() {
        Croprow cr = new Croprow();
        CornStalk cs = new CornStalk();
        CropDuster cd = new CropDuster();
        Pilot p = new Pilot();
        p.mount(cd);

        cr.plantCrop(cs);
        System.out.println(cr.getCrop());
        cd.fertilize(cr);
        cr.harvestCrop();

        System.out.println(cr.getCrop());
        Assert.assertNull(cr.getCrop());

    }

    public void testPlowCrop() {
    Croprow cr = new Croprow();
    TomatoPlant tp = new TomatoPlant();

    cr.plantCrop(tp);
    cr.plowCrop();

    System.out.println(cr.getCrop());
    Assert.assertNull(cr.getCrop());

    }
}