package org.fasttrackit;

public class Adoptive extends Animal {


    String colorHair;
    double money;
    double feed;
    double foodEaten;
    double maxFood;
    double hunger;
    double levelHappiness;
    double play;






    public double getFoodEaten() {
        return foodEaten;
    }

    public void setFoodEaten(double foodEaten) {
        this.foodEaten = foodEaten;
    }

    public Adoptive(){
        age = 23;
        name = null;
    }

    public Adoptive(int age, String name) {
        super(age, name);
    }




    public void feed(Food Food , double amount , int perDay, boolean full, Animal Animal , double price){
        System.out.println(name + " feed of "+ perDay + " an " + Animal + " with  " + Food + ", foods having "+ amount
                + " kilograms, " + " each worth " + price + " until it is " + full );

        if (feed > maxFood) {
            System.out.println("Maximum feed exceeded");

        }

        if (money <= 0) {
            System.out.println("You are out of money...");
        }



         // Sa imi spui te rog daca este buna formula pentru calcularea kilogramelor

         double kilograms = amount * perDay;

        System.out.println("Kilograms is: " + kilograms);

        foodEaten = foodEaten + kilograms;

        double usedMoney = price * kilograms;

        System.out.println("UsedMoney :" + usedMoney);

        money -= usedMoney;

        System.out.println("Remaining money : " + money);

        if (feed > hunger){
            System.out.println("The animal is full...");

        }


    }

    public  void play (double durationInHours,Animal Animal,RecreationalActivities RecreationalActivities,
                       double playing){

        System.out.println(name + "playing" + RecreationalActivities + " with " + Animal + durationInHours
                + " per day ");


        if ( play > levelHappiness ){
            System.out.println("The animal is very happy");


        }

    }
}
