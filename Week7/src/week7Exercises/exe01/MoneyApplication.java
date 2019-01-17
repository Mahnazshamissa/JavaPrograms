package week7Exercises.exe01;

import java.util.List;

public class MoneyApplication {
    public static void main(String[] args) {
        MoneyCollector moneyCollector = new MoneyCollector();
        List<Integer> payments = moneyCollector.getPayments();
        MoneyCalculator moneyCalculator = new MoneyCalculator();
        Integer total = moneyCalculator.add(payments);


        System.out.println("The collection af payments are : " + payments);
        System.out.println("Total is: " + total);
    }
}
