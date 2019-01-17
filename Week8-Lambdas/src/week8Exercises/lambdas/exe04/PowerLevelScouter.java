package week8Exercises.lambdas.exe04;

import java.util.function.Predicate;

public class PowerLevelScouter {

    public Integer scout (String name){
        return summingUp(name);
    }

    public Integer scoutEnhanced (String name){
        return summingUp(name.toLowerCase());
    }


    protected Integer summingUp(String name){
        Integer sum = 0;
        for (int i = 0; i < name.length() ; i++) {
            char character = name.charAt(i);
            Integer ascii = (int) character;
            sum += ascii;
        }
        return sum;
    }
}
