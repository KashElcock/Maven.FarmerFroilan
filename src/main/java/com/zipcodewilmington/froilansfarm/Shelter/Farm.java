package com.zipcodewilmington.froilansfarm.Shelter;

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
