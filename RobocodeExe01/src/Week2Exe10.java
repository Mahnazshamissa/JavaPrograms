import java.util.Scanner;

public class Week2Exe10 {
    public static void main(String[] args) {
        System.out.println("Tell me your number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int square = num * num;
        System.out.println("The Square is : " + square);

    }
}

/*
action​ calculateSquare(Number number) ​ returns​ Number
Number square ​ = ​ number ​ * ​ number
return​ square
Part B
say​ (“Give me the first number”)
Number number1 ​ = ​ ​ listen​ ()
Number squareResult ​ = ​ calculateSquare(number1)
say​ (“The result is ” ​ + ​ squareResult)
say​ (“Give me the second number”)
Number number2 ​ = ​ ​ listen​ ()
Number squareResult2 ​ = ​ calculateSquare(number2)
say​ (“The result is ” ​ + ​ squareResult)
 */