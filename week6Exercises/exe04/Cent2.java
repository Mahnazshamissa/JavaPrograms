package week6Exercises.exe04;

public class Cent2 extends Money {

    public Cent2(Integer cent) {
        super(2);
    }

    @Override
    public Boolean applicable(Integer amount) {
        return amount>=2;
    }
}
