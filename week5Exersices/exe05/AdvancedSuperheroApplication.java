package week5Exersices.exe05;

import week5Exersices.exe04.Superhero;
import week5Exersices.exe04.SuperheroCaller;

public class AdvancedSuperheroApplication {

    public static void main(String[] args) {

        SuperheroCaller superheroCaller = new SuperheroCaller();
        Joker joker = new Joker();
        for (int times = 0; times <10 ; times++) {
            Superhero superhero = superheroCaller.call();
            //joker.weaken(superhero);
            superhero.fight(joker);
        }

    }

}

/*
Create a SuperheroCaller. Reuse the one from exercise 4.
Create one Joker.
Use the SuperheroCaller ten times to call one superhero and make him fight the joker.

 */