import java.util.Scanner;

public class Week2Exe6 {
    public static void main(String[] args) {
        System.out.println("Tell me your first number");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();

        System.out.println("Tell me your second number");
        int num2 = scanner.nextInt();


        int sum = num1 + num2;
        System.out.println("The Sum is : " + sum);




    }


    /*  say​ (“Tell me your first number”)
Number number1 ​ = ​ ​ listen​ ()
say​ (“Tell me your second number”)
Number number2 ​ = ​ ​ listen​ ()
Number sum ​ = ​ number1 ​ + ​ number2
say​ (“The sum is: ” ​ + ​ sum)  */
}
