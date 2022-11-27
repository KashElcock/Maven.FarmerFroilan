package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Shelter.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Shelter.FarmHouse;
import com.zipcodewilmington.froilansfarm.Shelter.Field;
import com.zipcodewilmington.froilansfarm.Shelter.Stable;

/**
 * Created by leon on 2/26/18.
 */
public class MainApplication {

    public Farm setUpFarm() {
        Farm AnimalFarm = new Farm();
        Farmer Froilan = new Farmer();
        Pilot<Farmer> Froilanda = new Pilot<Farmer>();
        AnimalFarm.setOwner(Froilan);

        FarmHouse MainHouse = new FarmHouse();
        CropDuster AirFarm1 = new CropDuster();
        Tractor JohnDeere4440 = new Tractor();
        Tractor JohnDeere4455 = new Tractor();

        AnimalFarm.setFarmhouse(MainHouse);
        MainHouse.add(Froilan); MainHouse.add(Froilanda);

        AnimalFarm.addVehicle(AirFarm1);
        AnimalFarm.addVehicle(JohnDeere4440);
        AnimalFarm.addVehicle(JohnDeere4455);

        Field Front40 = new Field();
        Front40.plant(new CornStalk());
        Front40.plant(new TomatoPlant());
        Front40.plant(new CarrotPlant());
        Front40.plant(new CarrotPlant());
        Front40.plant(new CarrotPlant());

        AnimalFarm.setField(Front40);

        for (int i=1; i<4; i++) {
            AnimalFarm.addStable(new Stable());
        }

        for (int i=1; i<5; i++) {
            AnimalFarm.addChickenCoop(new ChickenCoop());
        }

        for (Stable s : AnimalFarm.getStables()) {
            s.fill(4);
        }

        for (ChickenCoop cc : AnimalFarm.getChickenCoops()) {
            cc.fill(4);
        }

        return AnimalFarm;
    }

    public void deleteFarm() {

    }
}
