package week6Exercises.exe03;

public abstract class CoffeeMaker {

    public abstract String getName();

    public abstract Integer getBrewingTime();

    public Coffee brew() {

        Coffee coffee = new Coffee(getName(), getBrewingTime());
        return coffee;

    }

}

/*
Create the CoffeeMaker abstract class.
It has the getName abstract method that returns a String.
It has the getBrewingTime abstract method that returns an Integer.
It has the brew method that returns a Coffee.
It uses the getName and getBrewingTime methods
to create a Coffee and returns it.

 */