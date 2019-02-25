package exe02.withFormatter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MilitaryTimeExchangerTest {
    private MilitaryTimeExchanger militaryTimeExchanger = new MilitaryTimeExchanger();


    @Test
    void testMidnight() {
        String actual = militaryTimeExchanger.toMilitaryTime("12:00:00AM");
        String expected = "00:00:00";
        System.out.println(actual);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void testNoon(){
        String actual = militaryTimeExchanger.toMilitaryTime("12:00:00PM");
        String expected = "12:00:00";
        System.out.println(actual);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void testAfterNoon(){
        String actual = militaryTimeExchanger.toMilitaryTime("02:56:07PM");
        String expected = "14:56:07";
        System.out.println(actual);
        Assertions.assertEquals(expected,actual);
    }
}
