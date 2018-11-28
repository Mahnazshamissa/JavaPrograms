package startingExercise.exe05;

import startingExercise.exe01.Article;
import startingExercise.exe01.Printer;

public class MagazineApplication {

    public static void main(String[] args) {

        Editor editor = new Editor();
        Magazine magazine = editor.writeMagazine();

        Printer printer = new Printer();
        printer.printMagazine(magazine);

    }
}
