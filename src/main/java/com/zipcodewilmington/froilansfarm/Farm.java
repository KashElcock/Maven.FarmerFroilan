package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Shelter.*;

import java.util.ArrayList;

public class Farm {

    Farmer owner;
    private Field field;
    private FarmStand farmStand;
    FarmHouse farmhouse;
    ArrayList<Stable> stables = new ArrayList<Stable>();
    ArrayList<ChickenCoop> chickenCoops = new ArrayList<ChickenCoop>();


    public Farm(){
        field = new Field();
        farmStand = new FarmStand();
    }

    public void setField(Field field) {
        this.field = field;
    }

    public Field getField() {
        return field;
    }

    public void setFarmStand(FarmStand farmStand) {
        this.farmStand = farmStand;
    }

    public FarmStand getFarmStand() {
        return farmStand;
    }

    public void setOwner(Farmer owner) {
        this.owner = owner;
    }

    public Farmer getOwner() {
        return this.owner;
    }

    public void addChickenCoop(ChickenCoop coop) {
        chickenCoops.add(coop);
    }

    public ArrayList<ChickenCoop> getChickenCoops() {
        return chickenCoops;
    }
}
