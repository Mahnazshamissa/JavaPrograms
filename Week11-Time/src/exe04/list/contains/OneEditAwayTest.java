package exe04.list.contains;

import exe04.list.contains.OneEditAway;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.Instant;

public class OneEditAwayTest {
    private OneEditAway oneEditAway = new OneEditAway();

    @Test
    void testIsPLEOneEditAway() {
        Instant start = Instant.now();
        Boolean isOneAway = oneEditAway.isOneEditAway("pale", "ple");
        Assertions.assertTrue(isOneAway);
        Instant end = Instant.now();
        System.out.println("Time duration for the test1: " + Duration.between(start, end).toMillis());
    }

    @Test
    void testIsPALESOneEditAway() {
        Instant start = Instant.now();
        Boolean isOneAway = oneEditAway.isOneEditAway("pale", "pales");
        Assertions.assertTrue(isOneAway);
        Instant end = Instant.now();
        System.out.println("Time duration for the test2: " + Duration.between(start, end).toMillis());
    }

    @Test
    void testIsBALEOneEditAway() {
        Instant start = Instant.now();
        Boolean isOneAway = oneEditAway.isOneEditAway("pale", "bale");
        Assertions.assertTrue(isOneAway);
        Instant end = Instant.now();
        System.out.println("Time duration for the test3: " + Duration.between(start, end).toMillis());
    }

    @Test
    void testIsBAKEOneEditAway() {
        Instant start = Instant.now();
        Boolean isOneAway = oneEditAway.isOneEditAway("pale", "bake");
        Assertions.assertFalse(isOneAway);
        Instant end = Instant.now();
        System.out.println("Time duration for the test4: " + Duration.between(start, end).toMillis());
    }

}
