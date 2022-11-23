package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class CropDusterTest {

    @Test
    public void testCropDuster() {
        CropDuster cd = new CropDuster();
        Croprow croprow = new Croprow();

        cd.mount(new Pilot());
        Assert.assertTrue(cd.mounted);
        cd.fertilize(croprow);

        cd.isMounted();

        cd.setMounted(false);
        Assert.assertFalse(cd.mounted);
        String actNoise = cd.makeNoise();
        Assert.assertEquals("zoom zoom zoom", actNoise);
    }
}
