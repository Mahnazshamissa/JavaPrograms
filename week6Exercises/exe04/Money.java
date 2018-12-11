package week6Exercises.exe04;

public abstract class Money {

    private Integer cent;


    public Money(Integer cent) {
        this.cent = cent;
    }

    public Integer getCent() {
        return cent;
    }

    public abstract Boolean applicable(Integer amount);

    /*public Integer change() {

        Integer mod = 0;

        if (amount >= cent) {
            mod= amount % cent;
        }
        return mod;
    }*/


    }
/*
Create the Money abstract class that will represent one single cent coin.
Design this class with the help of attributes,
methods or abstract methods, so that at least it can tell its amount
as Integer and whether it is applicable for an Integer amount.

 */