package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Shelter.Stable;
import org.junit.Test;

/**
 * Created by leon on 2/26/18.
 */
public class MainApplicationTest {

    @Test
    public void testMainApplication() {
        MainApplication ma = new MainApplication();
        Farm farm = ma.setUpFarm();
        Farmer froilan = (Farmer) farm.getFarmhouse().get(0);
        Pilot froilanda = (Pilot) farm.getFarmhouse().get(1);

        Stable s1 = farm.getStables().get(0);
        Stable s2 = farm.getStables().get(1);
        for (Horse horse : s1) {
            froilan.mount(horse);
            froilan.disMount(horse);
        }
        for (Horse horse : s2) {
            froilanda.mount(horse);
            froilanda.disMount(horse);
        }
    }
}
