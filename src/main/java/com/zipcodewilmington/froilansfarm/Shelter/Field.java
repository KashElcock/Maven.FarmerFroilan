package com.zipcodewilmington.froilansfarm.Shelter;

import com.zipcodewilmington.froilansfarm.Crop;
import com.zipcodewilmington.froilansfarm.Croprow;

import java.util.ArrayList;
import java.util.List;

public class Field <T extends Croprow>{

    private List<T> cropRows = new ArrayList<T>();

    public Field() {

    }

    public List<T> getCropRows() {
        return cropRows;
    }

    public void plant(Crop crop){
        Croprow croprow = new Croprow();
        croprow.plantCrop(crop);
        cropRows.add((T) croprow);
    }

    public void plow(){
        cropRows.clear();
    }
}



