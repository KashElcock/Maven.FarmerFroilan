package com.zipcodewilmington.froilansfarm;

public class CornStalk extends Crop <EarCorn> {
    public CornStalk() {
        super(false);
    }

    public EarCorn yield() {
        return new EarCorn();
    }

    public boolean isEdible() {
        return true;
    }
}
