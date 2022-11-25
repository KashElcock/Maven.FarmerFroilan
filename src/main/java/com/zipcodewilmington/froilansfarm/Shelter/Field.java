package com.zipcodewilmington.froilansfarm.Shelter;

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

    public void setCropRows(List<T> cropRows) {
        this.cropRows = cropRows;
    }
    public void plant(T cropRow){

        cropRows.add(cropRow);
    }


    public void harvest(T cropRow){
        cropRows.remove(cropRow);
    }
    public void plow(T cropRow){
        cropRows.clear();
    }
}



