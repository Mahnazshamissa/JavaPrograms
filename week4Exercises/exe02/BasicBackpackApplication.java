package week4Exercises.exe02;

import java.util.HashSet;
import java.util.Set;

public class BasicBackpackApplication {

    public static void main(String[] args) {

        Set<String> backpack = new HashSet<>();
        System.out.println("The first set of backpack is : " + backpack);

        backpack.add("toothpaste");
        backpack.add("towel");
        backpack.add("underwear");
        System.out.println("The backpack with three different items : " + backpack);


        //boolean containsUnderWear = backpack.contains("underwear");


        if (backpack.contains("underwear")){
            System.out.println("The backpack contains underwear.");
        }

        //System.out.println("The backpack contains "+ containsUnderWear);

        backpack.remove("underwear");
        System.out.println("The backpack after removing third item : " + backpack);

       // boolean notContainsUnderWear = backpack.contains("underwear");


        if (!backpack.contains("underwear")){
            System.out.println("The backpack no longer contains underwear.");
        }


        //System.out.println("The backpack no longer contains " + notContainsUnderWear);

        backpack.add("towel");
        backpack.add("towel");
        System.out.println("The backpack with three same items : " + backpack);


        backpack.size();
        System.out.println("Backpack size : "+ backpack.size());


    }
}


/*
Create an empty backpack set and display it.
Create three Strings that represent three different items.
Add them to the backpack set and display it.
Ask if one of them is contained in the set and display the answer.
Remove one of them by providing its name as an argument and display the set.
Ask if the element you just removed is not contained in the set and display the answer.
Add one of the existing items twice and display the set.
Display its size.

 */