package exe03.partBWithIfElse;

import java.util.HashMap;
import java.util.Map;

public class TimeDescriptionIntoWordsB {


    public String toWorde(Integer hour,Integer minutes){

        Map<Integer, String> words = getWords();
        String output = "";
        output = getMinutes(hour, minutes, words);

        return getExactTimeOfDay(hour, minutes, words);
    }

    private String getExactTimeOfDay(Integer hour, Integer minutes, Map<Integer, String> words) {
        String output;
        if (hour>=6 && hour<12){
            output= getMinutes(hour, minutes, words) + " in the morning";
        }
        else if (hour.equals(12)){
            output=("noon");
        }
        else if (hour>12 && hour<17){
            output= getMinutes(hour, minutes, words) + " in the afternoon";
        }
        else if (hour>17 && hour<20){
            output= getMinutes(hour, minutes, words) + " in the evening";
        }
        else if (hour>20 || hour<6){
            output= getMinutes(hour, minutes, words) + " at night";
        }
        else {
            output=("midnight");
        }

        return output;
    }


    public static String getMinutes(Integer hour, Integer minutes, Map<Integer, String> words) {
        String output;
        if (minutes.equals(0)){
            output = words.get(hour)+ " o' clock";
        }
        else if (minutes<30){
             output = words.get(minutes) + " minutes past " + words.get(hour);
        }
        else {
            minutes=60-minutes;
             output = words.get(minutes) + " minutes to " + words.get(hour+1);
        }
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
