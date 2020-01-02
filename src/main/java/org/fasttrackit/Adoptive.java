package org.fasttrackit;

public class Adoptive extends Animal {

    String colorHair;
    double money;

    public Adoptive(){
        age = 23;
        name = null;
    }


    public Adoptive(int age, String name) {
        super(age, name);
    }
}
