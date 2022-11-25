package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class Croprow <T extends Crop>{

    private List<T> crops;

    public Croprow(){
        crops = new ArrayList<T>();
    }

    public List<T> getCrops() {

        return crops;
    }

    public void setCrops(List<T> crops) {

        this.crops = crops;
    }

    public void plantCrop(T crop){
        crops.add(crop);
    }

    public void harvestCrop(T crop){

        crops.remove(crop);

    }
    public void plowCrop(T crop){
        crops.clear();
    }


}

