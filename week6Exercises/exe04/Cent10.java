package week6Exercises.exe04;

public class Cent10 extends Money {


    public Cent10(Integer cent) {
        super(10);
    }

    @Override
    public Boolean applicable(Integer amount) {
        return amount>=10;
    }
}
