package org.fasttrackit;


public class Animal {
    public Adoptive adoptive;
    public Food food;
    public PlayGrounds playGrounds;
    public VeterinaryDoctors veterinaryDoctors;
    public RecreationalActivities reconditionalActivities;
    public AnimalToys animaltoys;
    public AnimalHouse animalHouse;
    public AnimalBad animalBad;
    String name;
    int age;
    String color;
    String healthCondition;
    String hunger;
    String mood;
    double height;
    double weight;
    int legs;
    String skin;
    boolean happy;
    double reaction;



    public Animal(){
        age = 7;
        name = null;

    }


    public Animal(int age,String name) {
        this.age = age;
        this.name = name;

    }



    public java.lang.String toString() {
        return "This animal's name is : " + this.name + " and he/she have" + this.age + " years old ";

    }

    public double happiness(boolean happy,double reaction) {

        System.out.println(name + " is very happy " + happy + " \n" +
                "when it hits the tail of " + reaction);

        return reaction;

    }
}
