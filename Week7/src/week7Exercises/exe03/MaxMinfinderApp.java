package week7Exercises.exe03;

import java.util.List;

public class MaxMinfinderApp {
    public static void main(String[] args) {

        NumberList numberList = new NumberList();
        List<Integer> listOfNr = numberList.getListOfNr();

        MinValue minValue = new MinValue();
        Integer minimum = minValue.minimum(listOfNr);

        MaxValue maxValue = new MaxValue();
        Integer maximum = maxValue.maximum(listOfNr);

        System.out.println("the list is "+listOfNr);
        System.out.println("the Maximum of list is "+maximum);
        System.out.println("the minumum of List is "+minimum);


    }
}
