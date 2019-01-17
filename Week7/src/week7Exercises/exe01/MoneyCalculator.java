package week7Exercises.exe01;

import java.util.List;

public class MoneyCalculator {

    Integer sum = 0;

    public Integer add(List<Integer> payments) {
        for (Integer payment : payments) {
            sum += payment;
        }
        return sum;

    }
}


/*
A MoneyCalculator that receives money numbers and
returns the accumulated value.

 */
