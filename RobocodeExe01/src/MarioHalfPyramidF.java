// Work of Fatemeh, Amin and Paulius


import java.util.Scanner;

public class MarioHalfPyramidF {
    public static void main(String[] args) {

        Integer height = promptAndValidateUserInput();
        drawTheHalfPiramid(height);
    }

    public static Integer promptAndValidateUserInput() {

        int height = 0;

        do {
            System.out.println("Height: ");
            Scanner scanner = new Scanner(System.in);
            height = scanner.nextInt();

        }while (!isInRange(height));

        return height;
    }

    public static void drawTheHalfPiramid(Integer height) {
        for (int currentLineNumber = 1; currentLineNumber <= height; currentLineNumber++) {

            for (int numberOfSpaces = 0; numberOfSpaces < height - currentLineNumber; numberOfSpaces++) {
                System.out.printf(" ");
            }

            for (int numberOfHashes = height - currentLineNumber; numberOfHashes < height + 1; numberOfHashes++) {
                System.out.printf("#");
            }

            System.out.printf("\n");
        }
    }

    public static Boolean isInRange(int number) {
        return (number >= 0 && number <= 23);
    }
}
