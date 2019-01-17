package week8Exercises.lambdas.exe04withFunction;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import week8Exercises.lambdas.exe04.PowerLevelScouter;

class PowerLevelScouterTest {

    private PowerLevelScouter scouter = new PowerLevelScouter();
    private String name = "Susana";

    @Test
    void scout() {
        Integer actual= scouter.scout(name);
        Integer expected = 619;
        Assertions.assertEquals(expected,actual);

    }

    @Test
    void scoutEnhanced() {
        Integer actual= scouter.scoutEnhanced(name);
        Integer expected = 651;
        Assertions.assertEquals(expected,actual);

    }
}