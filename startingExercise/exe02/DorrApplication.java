package startingExercise.exe02;

import java.util.Scanner;

public class DorrApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Key key = new Key();

        Integer doorNumber = scanner.nextInt();
        Door door = new Door(doorNumber);

        key.open(door);


    }

}
