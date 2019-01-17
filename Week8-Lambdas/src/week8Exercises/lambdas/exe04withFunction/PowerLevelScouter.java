package week8Exercises.lambdas.exe04withFunction;

import java.util.function.Function;

public class PowerLevelScouter {

    public Integer scout (String name){
        return powerLevelFinder(name, e->(int)e.charAt(0));
    }

    public Integer scoutEnhanced (String name){

        return powerLevelFinder(name, e->(int)e.toLowerCase().charAt(0));
    }


    protected Integer powerLevelFinder(String name , Function<String, Integer> transformation){
        Integer sum = 0;
        String[] split = name.split("");
        for (String letter : split) {
            Integer ascii = transformation.apply(letter);
            sum += ascii;
        }
        return sum;
    }
}


        /*for (int i = 0; i < name.length() ; i++) {
            char character = name.charAt(i);
            Integer ascii = (int) character;
            sum += ascii;
        }*/