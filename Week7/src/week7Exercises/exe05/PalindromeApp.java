package week7Exercises.exe05;

import java.util.Scanner;

public class PalindromeApp {
    public static void main(String[] args) {
        System.out.println("please enter the word:");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        //SpaceRemover spaceRemover = new SpaceRemover();
        //String nospaceword = spaceRemover.removeSpace(word);

        Palindrome palindrome = new Palindrome();
        String answer = palindrome.isPalindrome(word);

        System.out.println(answer);
    }
}
