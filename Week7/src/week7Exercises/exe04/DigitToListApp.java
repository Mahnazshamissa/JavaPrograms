package week7Exercises.exe04;

import java.util.List;
import java.util.Scanner;

public class DigitToListApp {
    public static void main(String[] args) {
        System.out.println("please Enter the Number");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        Splitor splitor = new Splitor();
        List<String> digit = splitor.split(input);

        System.out.println("output collection: " + digit);
    }
}
