package startingExercise.exe01;

import java.util.Scanner;

public class PrintApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the title:");
        String title = scanner.nextLine();
        System.out.println("Please enter the text:");
        String text = scanner.nextLine();

        Article article = new Article(title,text);
        Printer printer = new Printer();

        printer.print(article);

    }
}
