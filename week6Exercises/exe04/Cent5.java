package week6Exercises.exe04;

public class Cent5 extends Money {

    public Cent5(Integer cent) {
        super(5);
    }

    @Override
    public Boolean applicable(Integer amount) {
        return amount>=5;
    }
}
