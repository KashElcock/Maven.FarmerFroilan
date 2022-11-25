package com.zipcodewilmington.froilansfarm;

import junit.framework.TestCase;
import org.junit.Assert;

public class EdibleEggTest extends TestCase {

    public void testIsEdible() {
        EdibleEgg e1 = new EdibleEgg();
        e1.isEdible();
        Assert.assertEquals(true,e1.isEdible());
    }
}