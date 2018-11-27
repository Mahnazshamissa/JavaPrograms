package week4Exercises.exe01;

import java.util.ArrayList;
import java.util.List;

public class BasicShoppingApplicationMahnaz {

    public static void main(String[] args) {


        List<String> groceries = new ArrayList<>();
        System.out.println("The first list of groceries is : " + groceries);

        groceries.add("Bananas");
        groceries.add("Oranges");
        groceries.add("Tomatos");
        System.out.println("The groceries with three different fruites : " + groceries);


        groceries.remove("Oranges");
        System.out.println("The groceries after removing one of fruites :" + groceries);

        groceries.add("Tomatos");
        groceries.add("Tomatos");
        System.out.println("The groceries with three same fruites : " + groceries);

        groceries.remove(2);
        System.out.println("The groceries after removing third fruites : " + groceries);

        groceries.size();
        System.out.println("Groceries size : "+ groceries.size());


    }

}
