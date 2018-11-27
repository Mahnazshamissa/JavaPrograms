package week4Exercises.exe01;

import java.util.ArrayList;
import java.util.List;

public class BasicShoppingApplicationAmin {

    public static void main(String[] args){

   // public static void list() {

        List<String> groceries = new ArrayList<>();
        System.out.println("The first list of groceries is : " + groceries);

        String banana = "Banana";
        String orange = "Oranges";
        String tomato = "Tomatos";

        groceries.add(banana);
        groceries.add(orange);
        groceries.add(tomato);
        System.out.println("The groceries with three different fruites : " + groceries);


        groceries.remove(orange);
        System.out.println("The groceries after removing one of fruites :" + groceries);

        groceries.add(tomato);
        groceries.add(tomato);
        System.out.println("The groceries with three same fruites : " + groceries);

        groceries.remove(2);
        System.out.println("The groceries after removing third fruites : " + groceries);

        groceries.size();
        System.out.println("Groceries size : "+ groceries.size());

    //}
    }
}


/*
Create an empty groceries list and display it.
Create three Strings that represent three different groceries.
Add them to the groceries list and display it.
Remove one of them by providing its name as an argument and display the list.
Add one of the existing groceries twice and display the list.
Remove the third element of the list by providing its position and display it.
Display its size.

 */