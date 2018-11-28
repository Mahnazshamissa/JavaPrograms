import java.util.Scanner;

public class Week1ReflectionExe2 {
    public static void main(String[] args) {
        Integer dereksBudget = getDerekBudget();
        Integer debtsOfFriends = getDebtsOfFriends();
        canDerekTreatFriends(dereksBudget, debtsOfFriends);


    }

    public static void canDerekTreatFriends(Integer dereksBudget, Integer debtsOfFriends) {

        boolean canInvite = hasDerekGotMoneyToPayForFriends(dereksBudget, debtsOfFriends);
        if (!canInvite) {
            System.out.println("Sorry, I can't invite you.");
        } else {
            System.out.println("I will pay for all.");
            System.out.println("How much cost derek meal?");
            Scanner scanner = new Scanner(System.in);
            Integer derekMeal = scanner.nextInt();
            if (dereksBudget - debtsOfFriends - derekMeal >=0) {
                System.out.println(" ");
            }
            else{
                System.out.println("I made a mistake with calculating. I’m sorry. I cannot invite you today.");
            }
        }
    }
    public static boolean hasDerekGotMoneyToPayForFriends(Integer dereksBudget, Integer totalDebts) {
            Integer remainMoney= dereksBudget-totalDebts;
            boolean hasDerekGotEnough = remainMoney >= 0;
            return hasDerekGotEnough;

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

}
