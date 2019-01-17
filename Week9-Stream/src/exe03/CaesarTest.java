package exe03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarTest {

    private Caesar caesar = new Caesar();

    @Test
    void cipher1() {
        String actual = caesar.cipher("HELLO", 1);
        String expected = "IFMMP";
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void cipher2() {
        String actual = caesar.cipher("hello, world", 13);
        String expected = "uryyb, jbeyq";
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void cipher3() {
        String actual = caesar.cipher("be sure to drink your Ovaltine", 13);
        String expected = "or fher gb qevax lbhe Binygvar";
        Assertions.assertEquals(expected,actual);
    }
}