package week7Exercises.exe04;

import java.util.Arrays;
import java.util.List;

public class Splitor {
    public List<String> split(String input) {
        String[] digit = input.split("");
        return Arrays.asList(digit);
    }
}
