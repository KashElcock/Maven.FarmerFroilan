package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Shelter.Field;
import org.junit.Assert;
import org.junit.Test;

public class FieldTest {

    @Test
    public void testField() {
        //establish field variables
        Field field = new Field();
        TomatoPlant tp = new TomatoPlant();
        CornStalk cs = new CornStalk();
        CarrotPlant cp = new CarrotPlant();
        //plant crops
        field.plant(tp);
        field.plant(cs);
        field.plant(cp);

        //test crops were planted
        Assert.assertEquals(3, field.getCropRows().size());

        //test plow field removed all crops
        field.plow();
        Assert.assertEquals(0, field.getCropRows().size());
    }
}
