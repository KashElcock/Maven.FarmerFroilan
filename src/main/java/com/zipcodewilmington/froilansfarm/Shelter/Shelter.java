package com.zipcodewilmington.froilansfarm.Shelter;

import com.zipcodewilmington.froilansfarm.Chicken;
import jdk.nashorn.internal.runtime.regexp.JoniRegExp;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public  abstract class  Shelter<T> extends ArrayList<T> {
    public Shelter() {
    }
    public abstract void fill(int numToFill);
}
