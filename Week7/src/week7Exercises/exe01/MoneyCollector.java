package week7Exercises.exe01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MoneyCollector {
    Random random = new Random();
    List<Integer> payments = new ArrayList<>();

    public List<Integer> getPayments() {
        for (int i = 0; i < 10; i++) {

            Integer nextMoney = random.nextInt(5)+1;
            payments.add(nextMoney);
        }
        return payments;
    }

}

/*
A MoneyCollector class that provides a collection containing
all the different payments from his friends.
You can generate these numbers randomly so that his ten friends
always pay each between one and five Euro.

 */
