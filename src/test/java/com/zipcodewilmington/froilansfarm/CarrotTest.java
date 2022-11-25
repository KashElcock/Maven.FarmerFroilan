package com.zipcodewilmington.froilansfarm;

import junit.framework.TestCase;
import org.junit.Assert;

public class CarrotTest extends TestCase {

    public void testIsEdible() {
        Carrot c = new Carrot();
        c.isEdible();
        Assert.assertEquals(true,c.isEdible());
    }
}