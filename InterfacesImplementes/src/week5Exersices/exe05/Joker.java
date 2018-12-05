package week5Exersices.exe05;

import week5Exersices.exe04.SuperheroCaller;

public class Joker implements Villain {

    Integer lives=10;



    @Override
    public void weaken(String name) {

        //while (lives>0){
        System.out.println("Damn you, " + name + "! You managed to weaken me!");
        lives--;

        //}
        if (lives==0){

            System.out.println("You all defeated me! But I will be back!");
        }

    }
}
