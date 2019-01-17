package week8Exercises.lambdas.exe05;

import java.util.function.Predicate;

public class PredicateIntoFunction {

    public static void main(String[] args) {
        pred(10, e-> e > 7);
    }

    static void pred(int number, Predicate<Integer> condition) {
        if (condition.test(number)) {
            System.out.println("Number " + number);
        }
    }
}
