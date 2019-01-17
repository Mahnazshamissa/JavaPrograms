package week8Exercises.lambdas.exe02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class NumberFilterTest {

    private List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
    private NumberFilter numberFilter = new NumberFilter();

    @Test
    void getEven() {
        List<Integer> actual= numberFilter.getEven(numbers);
        List<Integer> expected = Arrays.asList(2, 4, 6);
        Assertions.assertEquals(expected,actual);

    }

    @Test
    void getOdd() {
        List<Integer> actual= numberFilter.getOdd(numbers);
        List<Integer> expected = Arrays.asList(1, 3, 5);
        Assertions.assertEquals(expected,actual);
    }
}