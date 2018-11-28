package week3Traits.exe03;

public class NumberCorrector {

    public Integer correct(Double messedUp){
        Double floored=Math.floor(messedUp);
        Double corrected=Math.abs(floored);
        return corrected.intValue();
    }
}
