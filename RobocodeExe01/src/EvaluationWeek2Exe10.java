import java.util.Scanner;

public class EvaluationWeek2Exe10 {
    public static void main(String[] args) {
        System.out.println("Hello! What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Integer visitorCount=1;


        while (!name.isEmpty()){

            System.out.println("Welcome, " + name +" ! You are our visitor number " + visitorCount);
            visitorCount++;
            System.out.println(" ");

            System.out.println("Hello! What is your name?");
            name= scanner.nextLine();


        }
    }
}
