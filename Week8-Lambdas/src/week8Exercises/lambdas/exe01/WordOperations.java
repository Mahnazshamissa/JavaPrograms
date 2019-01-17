package week8Exercises.lambdas.exe01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class WordOperations {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>(Arrays.asList("somewhere", "scenario", "table", "cable", "glass", "backpack", "mouse"));
        System.out.println(words);

       /* Predicate<String> condition = name-> name.endsWith("e");
        List<String> wordsWithoutE = new ArrayList<>();
        for (String word : words) {
            if (!condition.test(word)){
                wordsWithoutE.add(word);
            }
        }
        System.out.println(wordsWithoutE);*/

        words.removeIf(e->e.endsWith("e"));
        System.out.println(words);

        words.replaceAll(e->e.toUpperCase());
        System.out.println(words);

        words.removeIf(e->e.length()<6);
        System.out.println(words);

       // words.forEach(word->System.out.println(word));
        words.forEach(e->System.out.println(e));





    }



}
