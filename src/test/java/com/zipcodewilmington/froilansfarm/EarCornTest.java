package com.zipcodewilmington.froilansfarm;

import junit.framework.TestCase;
import org.junit.Assert;

public class EarCornTest extends TestCase {

    public void testIsEdible() {
        EarCorn ec = new EarCorn();
        ec.isEdible();
        Assert.assertEquals(true,ec.isEdible());
    }
}