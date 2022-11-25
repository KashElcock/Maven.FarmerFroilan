package com.zipcodewilmington.froilansfarm;

import junit.framework.TestCase;
import org.junit.Assert;

public class CornStalkTest extends TestCase {

    public void testYield() {

        CornStalk cs = new CornStalk();
        cs.yield();
        Assert.assertNotNull(cs.yield());
    }

    public void testIsEdible() {
        CornStalk cs = new CornStalk();
        cs.isEdible();
        Assert.assertEquals(true,cs.isEdible());
    }
}