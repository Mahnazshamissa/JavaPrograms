package week8Exercises.lambdas.exe03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KeywordFinderTest {

    private KeywordFinder finder = new KeywordFinder();
    private String elegant = "The elephant is lifted eleven floors easily with the help of an electricity elevator";
    private String playful = "The rightful heir of the powerful king had an awful accident playing with a colorful bear";

    @Test
    void findElegant() {
        List<String> actual= finder.findElegant(elegant) ;
        List<String> expected = Arrays.asList("elephant", "eleven", "electricity", "elevator");
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void findPlayful() {
        List<String> actual= finder.findPlayful(playful) ;
        List<String> expected = Arrays.asList("rightful", "powerful", "awful", "colorful");
        Assertions.assertEquals(expected,actual);
    }
}