package org.fasttrackit;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Animal dog = new Animal();
        dog.name = "Max";
        dog.age = 1;
        dog.color = "White with black ";
        dog.legs = 4;
        dog.skin = "Hair";
        dog.height = 0.5;
        dog.weight = 13.7;
        dog.mood = " ";
        dog.healthCondition = " ";
        dog.hunger = ("I need more food " );
        Animal B = new Animal();

        System.out.println(" He is " + dog.name + ". " + "  have " + dog.age + " year " + " and your color is " + dog.color + ".");
        System.out.println(B);

        Adoptive adoptive1 = new Adoptive();
        adoptive1.name = "Alina";
        adoptive1.age = 18;
        adoptive1.colorHair = "Black";
        adoptive1.money = 3000;
        adoptive1.mood = " ";

        dog.adoptive = adoptive1;

        System.out.println("She is " + adoptive1.name + ", and  have a " + adoptive1.age + " years. ");
        System.out.println("She adopted Max because he seems very cute");

        Food food1 = new Food();
        food1.amount = 400;
        food1.favoriteFoodName = "Bone";
        food1.name = "Pedigree";
        food1.price = 24.9;
        System.out.println(food1.stockAvailability);
        System.out.println(food1.stockRefill + " Every tuesday at four o'clock");
        System.out.println(food1.expirationDate);

        dog.food = food1;

        System.out.println(" Max love " + food1.favoriteFoodName + " but sometimes he likes it too " + food1.name);

        PlayGrounds playGrounds1 = new PlayGrounds();
        playGrounds1.name = "Park";
        playGrounds1.favoritePlayGroundsName = "Park for dogs";
        playGrounds1.lenght = 100;
        playGrounds1.width = 100;

        dog.playGrounds = playGrounds1;

        System.out.println("Max loves to play in the " + playGrounds1.favoritePlayGroundsName);

        VeterinaryDoctors veterinaryDoctors1 = new VeterinaryDoctors();
        veterinaryDoctors1.name = "Alfons";
        veterinaryDoctors1.age = 42;
        veterinaryDoctors1.colorHair = "Blonde";
        veterinaryDoctors1.height = 1.84;
        veterinaryDoctors1.specialization = " Wound ";
        veterinaryDoctors1.rating = 4.7;
        veterinaryDoctors1.theExperienceAge = 17;
        veterinaryDoctors1.weight = 83;
        veterinaryDoctors1.mood = " ";

        dog.veterinaryDoctors = veterinaryDoctors1;

        System.out.println(veterinaryDoctors1.name + ", have " + veterinaryDoctors1.age + " years and he is a good veterinary");

        RecreationalActivities recreationalActivities1 = new RecreationalActivities();
        recreationalActivities1.favoriteRecreatioanlActivity = "Play with the ball";
        recreationalActivities1.RecreationalActivity = "To play with his master";
        System.out.println(recreationalActivities1.recreationTime);

        dog.reconditionalActivities = recreationalActivities1;

        System.out.println("Max is very nice when playing");

        AnimalToys animalToys1 = new AnimalToys();
        animalToys1.color = "Green";
        animalToys1.favoriteToysName = "ball";
        animalToys1.price = 15.8;
        animalToys1.weight = 0.6;

        dog.animaltoys = animalToys1;

        System.out.println("Max loves to play with the ball");

        AnimalHouse animalHouse1 = new AnimalHouse();
        animalHouse1.color = "Red";
        animalHouse1.height = 1.4;
        animalHouse1.name = "Dog cage";
        animalHouse1.width = 2;
        animalHouse1.lenght = 2.5;

        dog.animalHouse = animalHouse1;

        System.out.println("Max's cage is great");

        AnimalBad animalBad1 = new AnimalBad();
        animalBad1.color = "brown";
        animalBad1.name = "Max bed";
        animalBad1.height = 1.5;
        animalBad1.widht = 1.3;

        dog.animalBad = animalBad1;

        System.out.println("Max's bed is very comfortable for a dog");




    }


}
