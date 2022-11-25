package com.zipcodewilmington.froilansfarm;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CroprowTest extends TestCase {
@Test
    public void testGetCrops() {

    }
@Test
    public void testPlantCrop() {

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

    cr.plowCrop(tp);
    System.out.println(cr.getCrops());

    Assert.assertEquals(0,crlist.size());

    }

    public void testSetCrops() {
    }

    public void testHarvestCrop() {
    }

    public void testPlowCrop() {
    }
}