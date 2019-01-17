package week7Exercises.exe01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class MoneyCalculatorTest {

    private MoneyCalculator moneyCalculator = new MoneyCalculator();


    @Test
    void add() {

        List<Integer> testPayments = Arrays.asList(5, 3, 4, 2);
        Integer testSum = moneyCalculator.add(testPayments);
        Integer expected = 14;
        Assertions.assertEquals(expected, testSum);

    }
}