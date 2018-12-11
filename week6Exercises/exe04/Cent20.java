package week6Exercises.exe04;

public class Cent20 extends Money {


    public Cent20(Integer cent) {
        super(20);
    }

    @Override
    public Boolean applicable(Integer amount) {
        return amount>=20;
    }
}
