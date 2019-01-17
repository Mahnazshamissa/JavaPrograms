package week7Exercises.exe02;

import java.util.List;

public class AbbriviationApplication {
    public static void main(String[] args) {

        Names nameList = new Names();
        List<String> names = nameList.getList();

        Abbreviator abbreviator = new Abbreviator();
        List<String> abbreviatedNames = abbreviator.abbreviate(names);

        System.out.println("the names are: " + names);
        System.out.println("the abbrivations are: " + abbreviatedNames);

    }
}
