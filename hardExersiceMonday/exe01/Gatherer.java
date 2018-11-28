package hardExersiceMonday.exe01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gatherer {

    public List<Hiker> signUp(){

        List<Hiker> hikers = new ArrayList<>();

        System.out.println(" What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name=scanner.next();

        while (!name.isEmpty()){
            Hiker hiker = new Hiker(name);
            hikers.add(hiker);

            System.out.println(" What is your name?");
            name = scanner.nextLine();

        }
        return hikers;

    }

}

/*
Define the ​ Gatherer agent class ​ that has a ​ signUp method that asks for hiker’s names indefinitely until it
receives an empty String and returns the list of hikers that signed up for the hike.
 */