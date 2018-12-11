package week6Exercises.exe03;

import java.util.List;
import java.util.Optional;

public class CoffeeMakerApplication {

    public static void main(String[] args) {

        List<CoffeeMaker> coffeeMakers = CoffeeMakers.asList();

        for (CoffeeMaker coffeeMaker : coffeeMakers) {
            //coffeeMaker.brew();
            //System.out.println(coffeeMaker.getName() + " machine brewed a coffee and it took " + coffeeMaker.getBrewingTime() + " minutes");

            Coffee coffee = coffeeMaker.brew();
            System.out.println(coffee.getMadeBy() + " machine brewed a coffee and it took " + coffee.getBrewedTime() + " minutes");
        }



        for (CoffeeMaker coffeeMaker : coffeeMakers) {

            Optional<CoffeeMaker> newCoffeeMaker = CoffeeMakers.get("Moka");
            if (newCoffeeMaker.isPresent()) {
                System.out.println(coffeeMaker.getName() + " machine brewed a coffee and it took " + coffeeMaker.getBrewingTime() + " minutes");
            } else {

                System.out.println("The coffee maker with the name Moka pot is not available");
            }
        }


    }
}

/*
Use the CoffeeMakers class to receive all available coffee makers
as a list. For each one of them, brew a Coffee and display
the madeBy and brewedTime from the Coffee.

Use the CoffeeMakers class to get one by one each CoffeeMaker.
Check with the Optional if they are present,
and if so, use them to brew a Coffee and display the madeBy and brewedTime from it.
Use the CoffeeMakers class to get one maker that does not exist.
Check with the Optional that it is not present and display a message saying that
this particular coffee maker is not available.

 */