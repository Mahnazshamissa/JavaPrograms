package startingExercise.exe05;

import startingExercise.exe01.Article;

public class Editor {

    public Magazine writeMagazine() {

        Magazine magazine = new Magazine("First Magazine");

        magazine.add(new Article("First Article,", " First Text"));
        magazine.add(new Article("Second Article,", " Second Text"));
        magazine.add(new Article("Third Article,", " Third Text"));

        return magazine;
    }
}
