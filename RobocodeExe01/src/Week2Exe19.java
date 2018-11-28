import java.util.Scanner;

public class Week2Exe19 {
    public static void main(String[] args) {
        System.out.println("Welcome to our comic shop. How much is your comic?");
        Scanner scanner = new Scanner(System.in);
        Float price = scanner. nextFloat();

        System.out.println("How much are you going to pay?");
        int moneyPaid = scanner. nextInt();

        Integer  change = Math.round(moneyPaid - price);

        Integer cent = Math.round(((moneyPaid - price) * 100) % 100);


        System.out.println("Here you are, " + change + " euro " + " and " + cent + " cents.");



    }
}


/*
say​ (“Welcome to our comic shop. How much is your comic?”)
Number price ​ = ​ ​ listen​ ()
say​ (“How much are you going to pay?”)
Number moneyPaid ​ = listen​ ()
Number change
Number euro ​ = ​
Number cent ​ = ​
say​ (“Here you
​ moneyPaid ​ - ​ price
=
change.​ roundDown​ ()
(change ​ * ​ 100) ​ % ​ 100
are, ” ​ + ​ euro ​ + ​ “ and ” ​ + ​ cent ​ + ​ “ cents”)
 */