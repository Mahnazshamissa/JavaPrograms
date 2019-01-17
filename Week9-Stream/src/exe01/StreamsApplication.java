package exe01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsApplication {
    public static void main(String[] args) {
       // List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
        List<Integer> numbers = new ArrayList<>();
        for (int number = 1; number <=20 ; number++) {
            numbers.add(number);
        }

        List<Integer> evenNumbers = numbers.stream()
                .filter(e -> e % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even numbers:\n" + evenNumbers);


        List<Integer> oddNumbers = numbers.stream()
                .filter(e -> e % 2 != 0)
                .collect(Collectors.toList());
        System.out.println("Odd numbers:\n" +oddNumbers);

        List<Integer> numbersDiv3Bigger10 = numbers.stream()
                .filter(e -> e % 3 == 0)
                .filter(e -> e > 10)
                .collect(Collectors.toList());
        System.out.println("Numbers divisible by 3 and bigger than 10: \n" + numbersDiv3Bigger10);

        List<Integer> numbersSmaller5Multi3 = numbers.stream()
                .filter(e -> e <5)
                .map(e -> e*3)
                .collect(Collectors.toList());
        System.out.println("Numbers smaller than 5 and multiplied by 3:\n" + numbersSmaller5Multi3);

        List<String> numbersAsString = numbers.stream()
                .filter(e -> e > 8)
                .filter(e -> e < 12)
                //.forEach(e-> System.out.println("number " + e + " has " + e.toString().length() + " digits"));
                .map(e -> "number " + e + " has " + e.toString().length() + " digits")
                .collect(Collectors.toList());
        System.out.println("Digits of numbers bigger than 8 and smaller than 12:\n" + numbersAsString);



    }
}
