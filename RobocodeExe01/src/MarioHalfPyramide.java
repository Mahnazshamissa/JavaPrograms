import java.util.Scanner;

public class MarioHalfPyramide {
    public static void main(String[] args) {
        int height = -1;
//        Integer test = -1 % 1;

//        System.out.println(test);
        do {
            System.out.println("Height: ");
            Scanner scanner = new Scanner(System.in);
            height = scanner.nextInt();
        } while (!isInRange(height) /*|| !isInteger(height)*/);

        for (int lineNumber=1;lineNumber<=height;lineNumber++){


        }

    }

    public static Boolean isInRange(int number){
        return (number >= 0 && number <= 23);
    }

//    public static Boolean isInteger (int number){
//        return number % 1 == 0;
//    }
}


