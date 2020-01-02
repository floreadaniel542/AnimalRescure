package org.fasttrackit;

public class AnimalToys extends  AnimalHouse {

    String favoriteToysName;
    double weight;
    double price;

    public AnimalToys(){
        favoriteToysName = null;
        width = 1.9;
        price = 15;
    }

   public AnimalToys(String favoriteToysName, double weight , double price){
       this.weight = weight;
       this.price = price;
       this.favoriteToysName = favoriteToysName;
   }
}
