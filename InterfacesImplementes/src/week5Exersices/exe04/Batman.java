package week5Exersices.exe04;

import week5Exersices.exe05.Villain;

public class Batman implements Superhero {

    @Override
    public String getName() {
        return "Batman";
    }

    @Override
    public void fight(Villain villain) {
        villain.weaken(getName());
    }

    @Override
    public String toString() {
        return "Batman";
    }
}
