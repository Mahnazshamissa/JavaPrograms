package week7Exercises.exe04;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SplitToListTest {
    Splitor splitor = new Splitor();


    @Test
    void split() {
        String testInput = "12";
        List<String> splited = splitor.split(testInput);

        List<String> expected = Arrays.asList("1","2");

        assertEquals(expected, splited);


    }

}