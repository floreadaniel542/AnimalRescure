package org.fasttrackit;

public class VeterinaryDoctors extends Animal {

    double theExperienceAge;
    double rating;
    String colorHair;
    String specialization;
    double height;
    double weight;

    public VeterinaryDoctors(){
        age = 24;
        name = null;
    }


    public VeterinaryDoctors(int age, String name) {
        super(age, name);
    }
}
