package exe03.partAWithIfElse;

import exe03.partBWithIfElse.TimeDescriptionIntoWordsB;

import java.util.HashMap;
import java.util.Map;

public class TimeDescriptionIntoWords {


    public String toWorde(Integer hour,Integer minutes){

        Map<Integer, String> words = getWords();
        String output = "";

        output = TimeDescriptionIntoWordsB.getMinutes(hour, minutes, words);

        return output;
    }

    private Map<Integer, String> getWords(){
        Map<Integer, String> numWord = new HashMap<>();
        numWord.put(1,"one");
        numWord.put(2,"two");
        numWord.put(3,"three");
        numWord.put(4,"four");
        numWord.put(5,"five");
        numWord.put(6,"six");
        numWord.put(7,"seven");
        numWord.put(8,"eight");
        numWord.put(9,"nine");
        numWord.put(10,"ten");
        numWord.put(11,"eleven");
        numWord.put(12,"twelve");
        numWord.put(13,"thirteen");
        numWord.put(14,"fourteen");
        numWord.put(15,"fifteen");
        numWord.put(16,"sixteen");
        numWord.put(17,"seventeen");
        numWord.put(18,"eighteen");
        numWord.put(19,"nineteen");
        numWord.put(20,"twenty");
        numWord.put(21,"twenty-one");
        numWord.put(22,"twenty-two");
        numWord.put(23,"twenty-three");
        numWord.put(24,"twenty-four");
        numWord.put(25,"twenty-five");
        numWord.put(26,"twenty-six");
        numWord.put(27,"twenty-seven");
        numWord.put(28,"twenty-eight");
        numWord.put(29,"twenty-nine");
        return numWord;

    }
}
