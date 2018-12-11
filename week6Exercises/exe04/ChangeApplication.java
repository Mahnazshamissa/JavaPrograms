package week6Exercises.exe04;

import java.util.List;
import java.util.Scanner;

public class ChangeApplication {

    public static void main(String[] args) {

        System.out.println("Please enter the Value:");
        Scanner scanner=new Scanner(System.in);
        Integer input=scanner.nextInt();

        GreedyAlgorithm greedyAlgorithm = new GreedyAlgorithm();
        List<Money> coins=greedyAlgorithm.change(input);
        System.out.println("the number of coin are "+coins.size());

        System.out.println("the coins are ");
        for (Money coin : coins) {
            System.out.println(coin.getCent());
        }
    }
}

