package com.zipcodewilmington.froilansfarm.WeekOnTheFarm;

import com.zipcodewilmington.froilansfarm.Farm;
import org.junit.Test;
import static com.zipcodewilmington.froilansfarm.MainApplication.morningRoutine;

public class TuesdayTest {
    @Test
    public void TestDay() {
        Farm farm = morningRoutine();
       // System.out.println(farm.getFarmhouse().get(1).getFoodEaten());  FOR EXAMPLE OF PATTERN
    }
}
