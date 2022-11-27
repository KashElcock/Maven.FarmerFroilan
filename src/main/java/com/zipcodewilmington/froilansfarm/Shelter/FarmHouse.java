package com.zipcodewilmington.froilansfarm.Shelter;

import com.zipcodewilmington.froilansfarm.Edible;
import com.zipcodewilmington.froilansfarm.Omnivore;
import com.zipcodewilmington.froilansfarm.Person;

public class FarmHouse extends Shelter<Person>{
    public FarmHouse() {
    }

    public void fill(int numToFill) {

    }

    public void feedHouseMember(Person householdMember, Edible... edibles) {
        if(this.contains(householdMember)){
            for (Edible foodItem: edibles
                 ) {
                householdMember.eat(foodItem);
            }
        }else System.out.println("That person doesn't live in the house.");
    }
}
