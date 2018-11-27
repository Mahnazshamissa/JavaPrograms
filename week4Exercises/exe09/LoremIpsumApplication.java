package week4Exercises.exe09;

import java.util.List;

public class LoremIpsumApplication {

    public static void main(String[] args) {

        FileReader reader = new FileReader();
        readDocument(reader);
    }
    private static void readDocument(FileReader reader) {
        System.out.println("---- DOCUMENT");
        List<String> lines = reader.asLines("week4Exercises/exe09/lorem-ipsum.txt");
        for (String line : lines) {
            System.out.println(line);
        }
    }





}

