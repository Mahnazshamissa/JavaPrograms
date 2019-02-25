package exe03.partAWithInterfaceAndStream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ChooseMinutesTest {

    private ChooseMinutes chooser = new ChooseMinutes();

    @Test
    void toWordeTest1() {

        String actual = chooser.toWord(3,00);
        String expected = "three o' clock";
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void toWordeTest2() {

        String actual = chooser.toWord(5, 47);
        String expected = "thirteen minutes to six";
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void toWordeTest3() {

        String actual = chooser.toWord(13, 38);
        String expected = "twenty two minutes to fourteen";
        Assertions.assertEquals(expected, actual);

    }
}