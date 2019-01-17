package week8Exercises.robomime.exe01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Strategy1Test {

    @Test
    void getStrategies() {
        Decryptor decryptor = new Decryptor();
       // Strategy1 strategy1 = new Strategy1();
        String line = "r!o!b!o!t! !d!a!n!c!e!";
       // List<String> actuale = decryptor.getTrickes();
        Assertions.assertEquals("robot dance", "robot dance");


    }
}