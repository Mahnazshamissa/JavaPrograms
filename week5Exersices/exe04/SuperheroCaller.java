package week5Exersices.exe04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SuperheroCaller {


    private Superhero batman = new Batman();
    private Superhero superman = new Superman();
    private Superhero spiderman = new Spiderman();


    List<Superhero> superheroes = Arrays.asList(batman, superman, spiderman);


    public Superhero call() {

        Random random = new Random();
        Integer randomHero = random.nextInt(3);
        return superheroes.get(randomHero);


    }


}
