package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Shelter.*;

import java.util.ArrayList;

public class Farm {

    Farmer owner;
    private Field field;
    private FarmStand farmStand;
    FarmHouse farmhouse;
    ArrayList<Stable> stables = new ArrayList();
    ArrayList<ChickenCoop> chickenCoops = new ArrayList();
    ArrayList<Vehicle> vehicles = new ArrayList();

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

    public void setFarmhouse(FarmHouse fh) {
        this.farmhouse = fh;
    }

    public FarmHouse getFarmhouse() {
        return this.farmhouse;
    }

    public void addChickenCoop(ChickenCoop coop) {
        chickenCoops.add(coop);
    }

    public ArrayList<ChickenCoop> getChickenCoops() {
        return chickenCoops;
    }

    public void addStable(Stable stable) {
        stables.add(stable);
    }

    public ArrayList<Stable> getStables() {
        return stables;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }
}
