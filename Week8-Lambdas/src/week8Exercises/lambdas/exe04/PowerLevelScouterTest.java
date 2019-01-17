package week8Exercises.lambdas.exe04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

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