package exe04.stack;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OneEditAway {
    public Boolean isEditable(String word1, String word2) {
        int diferences = getDiferences(word1, word2);
        return diferences < 2;

    }

    private int getDiferences(String word1, String word2) {
        Stack<String> firstWord = new Stack<>();
        Stack<String> secondWord = new Stack<>();

        List<String> letters1 = Arrays.asList(word1.split(""));
        List<String> letters2 = Arrays.asList(word2.split(""));
        for (String letter : letters1) {
            firstWord.push(letter);
        }
        for (String letter : letters2) {
            secondWord.push(letter);
        }

        Integer checkTheDifference = getCheck(firstWord, secondWord);


        return diference;
    }

    private Integer getCheck(Stack firstWord, Stack secondWord) {
        int diference = 0;
        if (!firstWord.pop().equals(secondWord.pop())){
            diference++;
        }
        return diference;
    }

}
