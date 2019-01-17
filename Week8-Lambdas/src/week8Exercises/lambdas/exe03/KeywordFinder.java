package week8Exercises.lambdas.exe03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class KeywordFinder {

    public List<String> findElegant (String sentence){
        return findKeyword(sentence, e->e.startsWith("ele"));
    }

    public List<String> findPlayful (String sentence){
        return findKeyword(sentence, e->e.endsWith("ful"));
    }


    protected List<String> findKeyword(String sentence, Predicate<String> condition) {

        List<String> splitWords = new ArrayList<>();
        splitWords.addAll(Arrays.asList(sentence.split(" ")));
        List<String> result = new ArrayList<>();

        for (String splitWord : splitWords) {
            if (condition.test(splitWord)) {
                result.add(splitWord);
            }
        }
        return result;
    }
}
