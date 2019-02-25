package exe03.partBWithIfElse;

import exe03.partAWithIfElse.TimeDescriptionIntoWords;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TimeDescriptionIntoWordsBTest {
    private TimeDescriptionIntoWordsB description = new TimeDescriptionIntoWordsB();



    @Test
    void toWordeTest1() {

        String actual = description.toWorde(3,00);
        String expected = "three o' clock at night";
        Assertions.assertEquals(expected,actual);

    }

    @Test
    void toWordeTest2() {

        String actual = description.toWorde(15,47);
        String expected = "thirteen minutes to sixteen in the afternoon";
        Assertions.assertEquals(expected,actual);

    }

    @Test
    void toWordeTest3() {

        String actual = description.toWorde(18,38);
        String expected = "twenty-two minutes to nineteen in the evening";
        Assertions.assertEquals(expected,actual);

    }
}