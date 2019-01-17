package week7Exercises.exe03;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxMinValueTest {
    MinValue minValue = new MinValue();
    MaxValue maxValue = new MaxValue();

    @Test
    void minimum() {
        List<Integer> numbers = Arrays.asList(-7, 0, 1, 1000, -56);
        Integer minimum = minValue.minimum(numbers);

        Integer expected = -56;

        assertEquals(expected, minimum);
    }

    @Test
    void maximum() {
        List<Integer> numbers = Arrays.asList(-7, 0, 1, 1000, -56);
        Integer maximum = maxValue.maximum(numbers);

        Integer expected = 1000;

        assertEquals(expected, maximum);
    }

}