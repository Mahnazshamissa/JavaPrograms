package exe03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SmsExplorerTest {

    SmsExplorer smsExplorer = new SmsExplorer();


    @Test
    void getRatio() {
        String actual = "Ham/spam ratio: " + smsExplorer.getRatio();
        String expected = "Ham/spam ratio: ham 86% spam 13% ";
        Assertions.assertEquals(expected,actual);

    }

    @Test
    void getMostUsedHamWord() {
        String actual = "Most used ham word: " + smsExplorer.getMostUsedHamWord();
        String expected = "Most used ham word: to appears 1531 times ";
        Assertions.assertEquals(expected,actual);

    }

    @Test
    void getMostUsedHamLetter() {
        String actual = "Most used ham letter: " + smsExplorer.getMostUsedHamLetter();
        String expected = "Most used ham letter: e appears 26364 times ";
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void getLongestSpam() {
        String actual = "Longest spam message: " + smsExplorer.getLongestSpam().get();
        String expected = "Longest spam message: 224 ";
        Assertions.assertEquals(expected,actual);

    }
}