package startingExercise.exe01;

import startingExercise.exe05.Magazine;

public class Printer {

    public void print(Article article){

        System.out.println("The title is : " + article.getTitle());
        System.out.println("The text is : " + article.getText());
    }

    public void printMagazine(Magazine magazine){
        System.out.println(magazine.getTitle());



        for (Article article : magazine.getArticles()) {
                System.out.println(article.getTitle() + article.getText());
        }

    }
}
