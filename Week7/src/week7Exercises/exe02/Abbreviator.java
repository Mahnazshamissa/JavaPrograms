package week7Exercises.exe02;

import java.util.ArrayList;
import java.util.List;

public class Abbreviator {
    public List<String> abbreviate(List<String> Names) {

        ArrayList<String> abbreviatedList = new ArrayList<String>();
        for (String name : Names) {
            Integer length = name.length();
            if (length <2) {
                String abreviatName = name;
                abbreviatedList.add(abreviatName);
            } else {
                Integer abbrLenght = (int) (length / 2);
                String abriviateName = name.substring(0, abbrLenght);
                abbreviatedList.add(abriviateName);
            }
        }
        return abbreviatedList;
    }
}
