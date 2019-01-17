package week7Exercises.exe03;

import java.util.List;

public class MaxValue {
    public Integer maximum(List<Integer> numbers) {
        Integer maxValue = numbers.get(0);
        for (Integer number : numbers) {
            if (number >= maxValue) {
                maxValue = number;
            }
        }
        return maxValue;
    }
}
