package com.zipcodewilmington.froilansfarm;

import junit.framework.TestCase;
import org.junit.Assert;

public class TomatoTest extends TestCase {

    public void testIsEdible() {
        Tomato t = new Tomato();
        t.isEdible();
        Assert.assertEquals(true,t.isEdible());

    }
}