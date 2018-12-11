package week5Exersices.exe04;

import java.util.ArrayList;
import java.util.List;

public class SuperheroApplication {

    public static void main(String[] args) {

        SuperheroCaller superheroCaller = new SuperheroCaller();
        System.out.println("Superhero : "+ superheroCaller.call());

        List<Superhero> superheroes = new ArrayList<>();

        for (int times=1;times<7;times++){

            System.out.println("Superhero" + times + ": "+ superheroCaller.call());
            superheroes.add(superheroCaller.call());
        }

        System.out.println("Number of superheroes: " + superheroes.size());




    }
}


/*
Create a SuperheroCaller and use it to call one superhero.
Display its name.
Create a list of Superhero and add six superheroes
by calling them with the SuperheroCaller. Use a lop for this, please.
Display the superheroe names one by one with a loop
by also showing the number of appearance.
Display the number of superheroes by using the list’s size.
Create the SuperheroCallerTest class to test the call method.
Make sure it never returns null and that the superhero names
are either Batman, Superman or Spiderman.

 */