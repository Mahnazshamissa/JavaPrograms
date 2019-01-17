package week7Exercises.exe02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AbbreviatorTest {

    Abbreviator abbreviator = new Abbreviator();


    @Test
    void testAbbreviate() {
        List<String> words = Arrays.asList("Tree", "House", "I", "");
        List<String> abbreviations = abbreviator.abbreviate(words);

        List<String> expected = Arrays.asList("Tr", "Ho", "I", "");

        assertEquals(expected, abbreviations);
    }

}