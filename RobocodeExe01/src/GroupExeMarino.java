import java.util.Scanner;

public class GroupExeMarino {
    public static void main(String[] args) {
        Integer height = -1;
        int number = height;


        while (!isInRange(height) || !isInteger(height)) {
            System.out.println("Height: ");
            Scanner scanner = new Scanner(System.in);
            height = scanner.nextInt();
        }
    }
        public static Boolean isInRange(Integer number){
            return number < 0 && number > 23;
        }

        public static Boolean isInteger(Integer number){
            return number % 1 == 0;
        }

        /*
        do {
first line: spaces == height - lineNumber     hashes == lineNumber + 1
}
while lineNumber <= height;
         */
}
