package com.zipcodewilmington.froilansfarm.Shelter;

import com.zipcodewilmington.froilansfarm.CropDuster;
import com.zipcodewilmington.froilansfarm.Tractor;

public class Farm {

    private Field field;
    private FarmStand farmStand;

    public Farm(){
        field = new Field();
        farmStand = new FarmStand();
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public FarmStand getFarmStand() {
        return farmStand;
    }

    public void setFarmStand(FarmStand farmStand) {
        this.farmStand = farmStand;
    }
}
