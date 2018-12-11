package week6Exercises.exe03;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CoffeeMakers {

    private static List<CoffeeMaker> coffeeMakers = Arrays.asList(new AutoDrip(), new FrenchPress(), new AutomaticCoffeeMachine());


    public static List<CoffeeMaker> asList(){

       // List<CoffeeMaker> coffeeMakers = coffeeMakers;
        return coffeeMakers;

    }

    public static Optional<CoffeeMaker> get(String name){

        for (CoffeeMaker coffeeMaker : coffeeMakers) {
            if (coffeeMaker.getName().equalsIgnoreCase(name)){
                return Optional.of(coffeeMaker);
            }

        }
        return Optional.empty();


    }
}

/*
Create the CoffeeMakers class.
It has the asList static method that
returns the three CoffeeMakers as a list of CoffeeMaker.
 It has the get static method
 that receives a String representing the name of the coffee maker
 you want to receive, and it returns an Optional with the CoffeeMaker
 you wanted if it found it within its list of available ones.
 Otherwise an empty one.

 */