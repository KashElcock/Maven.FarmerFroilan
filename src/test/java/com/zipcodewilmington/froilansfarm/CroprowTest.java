package com.zipcodewilmington.froilansfarm;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CroprowTest extends TestCase {



@Test
    public void testGetCrops() {
    Croprow cr = new Croprow();
    TomatoPlant tp = new TomatoPlant();
    List<Crop> crlist = new ArrayList<Crop>();
    crlist.add(tp);
    cr.setCrops(crlist);
    System.out.println(cr.getCrops().get(0));
     Assert.assertNotNull(cr.getCrops());

     Assert.assertSame(tp,cr.getCrops().get(0));
    }
    public void testSetCrops() {
        Croprow cr = new Croprow();
        TomatoPlant tp = new TomatoPlant();
        List<Crop> crlist = new ArrayList<Crop>();
        crlist.add(tp);
        cr.setCrops(crlist);
        System.out.println(cr.getCrops().get(0));
        Assert.assertNotNull(cr.getCrops());

        Assert.assertSame(tp,cr.getCrops().get(0));

    }
@Test
    public void testPlantCrop1() {

    Croprow cr = new Croprow();
    TomatoPlant tp = new TomatoPlant();
    CornStalk cs = new CornStalk();
    CarrotPlant cp = new CarrotPlant();

    List<Crop> crlist = new ArrayList<Crop>();
    crlist.add(tp);
    crlist.add(cs);
    crlist.add(cp);
    cr.setCrops(crlist);

    System.out.println(cr.getCrops());
    Assert.assertEquals(3,crlist.size());

    tp.setHasBeenFertilized(true);
    System.out.println(tp.getHasBeenFertilized());

    System.out.println(tp.isEdible());

    System.out.println(tp.yield());

    tp.setHasBeenHarvested(true);
    System.out.println(tp.isHasBeenHarvested());

    cr.plantCrop(tp);
    System.out.println(cr.getCrops());

    cr.harvestCrop(tp);
    System.out.println(cr.getCrops());

    cr.plantCrop(tp);
    System.out.println(cr.getCrops());
    Assert.assertEquals(4,crlist.size());

    cr.plowCrop();
    System.out.println(cr.getCrops());

    Assert.assertEquals(0,crlist.size());

    }
    @Test
    public void testPlantCrop() {
        Croprow cr = new Croprow();
        TomatoPlant tp = new TomatoPlant();
        CornStalk cs = new CornStalk();
        CarrotPlant cp = new CarrotPlant();

        cr.plantCrop(tp);
        cr.plantCrop(cs);
        cr.plantCrop(cp);
        System.out.println(cr.getCrops());
        Assert.assertEquals(3,cr.getCrops().size());

    }

    public void testHarvestCrop() {
        Croprow cr = new Croprow();
        TomatoPlant tp = new TomatoPlant();
        CornStalk cs = new CornStalk();
        CarrotPlant cp = new CarrotPlant();

        cr.plantCrop(tp);
        cr.plantCrop(cs);
        cr.plantCrop(cp);
        System.out.println(cr.getCrops());
        cr.harvestCrop(tp);
        System.out.println(cr.getCrops());
        Assert.assertEquals(2,cr.getCrops().size());

    }

    public void testPlowCrop() {
    Croprow cr = new Croprow();
    TomatoPlant tp = new TomatoPlant();
    CornStalk cs  = new CornStalk();
    CarrotPlant cp = new CarrotPlant();
    cr.plantCrop(tp);
    cr.plantCrop(cs);
    cr.plantCrop(cp);
    cr.plowCrop();
        System.out.println(cr.getCrops());
        Assert.assertEquals(0,cr.getCrops().size());

    }
}