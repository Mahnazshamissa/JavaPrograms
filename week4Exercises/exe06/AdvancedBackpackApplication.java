package week4Exercises.exe06;

import java.util.HashSet;
import java.util.Set;

public class AdvancedBackpackApplication {

    public static void main(String[] args) {


        Set<Item> backpack = new HashSet<>();
        System.out.println("Backpack : " + backpack);

        Item toothpaste = new Item("toothpaste");
        Item towel = new Item("towel");
        Item underwear = new Item("underwear");

        backpack.add(toothpaste);
        backpack.add(towel);
        backpack.add(underwear);

        System.out.println("Backpack : " + backpack);


        if (backpack.contains(underwear)){
            System.out.println("The backpack contains underwear.");
        }


        backpack.remove(underwear);
        System.out.println("Backpack : " + backpack);


        if (!backpack.contains(underwear)){
            System.out.println("The backpack no longer contains underwear.");
        }



        backpack.add(towel);
        backpack.add(towel);
        if (towel.equals(towel)){

            System.out.println("Backpack : " + backpack);
        }


        backpack.size();
        System.out.println("Backpack size : "+ backpack.size());






    }
}
