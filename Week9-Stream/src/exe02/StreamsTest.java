package exe02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StreamsTest {
    private Streams streams = new Streams();

    @Test
    void getNames() {
        System.out.println(streams.getNames());
    }

    @Test
    void getNamesLessThan4() {
        //System.out.println(streams.getNamesLessThan4());
        List<String> actual = streams.getNamesLessThan4();
        List<String> expected = Arrays.asList("El");
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void getNamesEndsWithM() {
        List<String> actual = streams.getNamesEndsWithM();
        List<String> expected = Arrays.asList("HOSAM" , "TAMMAM");
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void getNamesContainsER() {
        List<String> actual = streams.getNamesContainsER();
        List<String> expected = Arrays.asList("Mehran", "Norbert", "Serife");
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void getNames4ContainsAM() {
        List<String> actual = streams.getNames4ContainsAM();
        List<String> expected = Arrays.asList("maarj", "aamin", "omaar");
        Assertions.assertEquals(expected,actual);
    }
}