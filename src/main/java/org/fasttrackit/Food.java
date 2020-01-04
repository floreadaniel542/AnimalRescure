package org.fasttrackit;

import java.util.Date;

public class Food extends Adoptive{

    double price;
    double amount;
    java.util.Date expirationDate;
    boolean stockAvailability;
    int stockRefill;
    String favoriteFoodName;

    public Food(){
        name = null;
        price = 11;
        favoriteFoodName = null;
    }

    public Food(double price,double amount,boolean stockAvailability,int stockRefill, String favoriteFoodName) {
        this.name = name;
        this.favoriteFoodName = favoriteFoodName;
        this.stockRefill = stockRefill;
        this.stockAvailability =  stockAvailability;
        this.price = price;
        this.amount = amount;

    }



}

