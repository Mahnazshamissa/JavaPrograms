package week7Exercises.exe03;

import java.util.List;

public class MinValue {
    public Integer minimum(List<Integer> numbers) {
        Integer minValue = numbers.get(0);
        for (Integer number : numbers) {
            if (number <= minValue) {
                minValue = number;
            }
        }
        return minValue;
    }
}
