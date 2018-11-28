package learningStepByStep.classroom;

import java.util.Scanner;

public class ClassroomApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tell me the student's name:");
        String name = scanner.nextLine();
        Student student = new Student(name);
        Marker blackMarker = new Marker("black");
        student.paint(blackMarker);
        Marker redMarker = new Marker("red");
        student.paint(redMarker);


    }
}
