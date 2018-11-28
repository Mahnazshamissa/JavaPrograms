package week3Traits.exe03;

import week3Traits.exe03.NumberCorrector;

import java.util.Random;

public class SupperMarketApplication {

    public static void main(String[] args) {
        Random random=new Random();
        NumberCorrector numberCorrector=new NumberCorrector();
        Integer num=random.nextInt(10);
        Double messedUp=random.nextDouble()+num;
        Integer corrected=numberCorrector.correct(messedUp);
        System.out.println("The wrong price is: "+messedUp);
        System.out.println("The correct number is: "+corrected);
    }
}
