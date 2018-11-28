import org.omg.PortableInterceptor.INACTIVE;

import java.util.Scanner;

public class Week1ReflectionExe1 {

    public static void main(String[] args) {
        Integer dereksBudget = getDerekBudget();
        Integer debtsOfFriends = getDebtsOfFriends();
        canDerekTreatFriends(dereksBudget, debtsOfFriends);
    }


    public static Integer getDerekBudget() {

            System.out.println("How much money has derek in his wallet? ");
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        }

    public static Integer getDebtsOfFriends() {
        Integer totalDebts=0;
        Integer numbersOfFriends = getNumbersOfFriends();
        for (int counter=1; counter<= numbersOfFriends;counter++) {
            System.out.println("How much money must you pay? ");
            Scanner scanner = new Scanner(System.in);
            Integer friendDebt = scanner.nextInt();
            totalDebts += friendDebt;
        }
        return totalDebts;

    }

    public static Integer getNumbersOfFriends() {

        System.out.println("How many friends are having dinner with him? ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void canDerekTreatFriends(Integer moneyDerekHas, Integer priceOfFriendsMeals) {
        boolean canInvite = moneyDerekHas >= priceOfFriendsMeals;
        if (!canInvite){
            System.out.println("Sorry, I can't invite you.");
        }
        else {
            System.out.println("I will pay for all.");
        }
    }


/*
        public static Integer getDinnerPrice() {

            System.out.println("How much costs dinner? ");
            Scanner scanner = new Scanner(System.in);
            int dinnerPrice = scanner.nextInt();

            return dinnerPrice;
        }

                public static Boolean isInRange(int budget) {
            return (budget >= dinnerPrice);
        }


 */

}
