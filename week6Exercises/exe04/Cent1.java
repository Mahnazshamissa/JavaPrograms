package week6Exercises.exe04;

public class Cent1 extends Money {

    public Cent1(Integer cent) {
        super(1);
    }

    @Override
    public Boolean applicable(Integer amount) {
        return amount>=1;
    }
}
