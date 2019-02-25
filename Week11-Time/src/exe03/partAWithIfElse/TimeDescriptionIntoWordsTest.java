package exe03.partAWithIfElse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TimeDescriptionIntoWordsTest {
    private TimeDescriptionIntoWords description = new TimeDescriptionIntoWords();



    @Test
    void toWordeTest1() {

        String actual = description.toWorde(3,00);
        String expected = "three o' clock";
        Assertions.assertEquals(expected,actual);

    }

    @Test
    void toWordeTest2() {

        String actual = description.toWorde(5,47);
        String expected = "thirteen minutes to six";
        Assertions.assertEquals(expected,actual);

    }

    @Test
    void toWordeTest3() {

        String actual = description.toWorde(13,38);
        String expected = "twenty-two minutes to fourteen";
        Assertions.assertEquals(expected,actual);

    }
}