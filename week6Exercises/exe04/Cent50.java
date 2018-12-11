package week6Exercises.exe04;

public class Cent50 extends Money {


    public Cent50(Integer cent) {
        super(50);
    }

    @Override
    public Boolean applicable(Integer amount) {
        return amount>=50;
    }
}
