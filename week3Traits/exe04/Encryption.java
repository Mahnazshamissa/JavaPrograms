package week3Traits.exe04;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Encryption {

    public String addEncryption(String newText) {
        List<String> letters = split(newText);
        String encryption = "";
        for (int pos = 0; pos < letters.size(); pos++) {
            encryption += letters.get(pos);
            encryption += makeRubbish();
        }
        return encryption;
    }
    private String makeRubbish() {
        Random random = new Random();
        List<String> rubbishChoice = Arrays.asList("#", "%", "&", "!", "?", "@");
        String rubbishElement = "";
        int randomInt = random.nextInt(5);
        for (int i = 0; i <= randomInt; i++) {
            rubbishElement += rubbishChoice.get(i);
            Collections.shuffle(rubbishChoice);
        }
        return rubbishElement;
    }
    private List<String> split(String newText) {
        String[] letter = newText.split("");
        List<String> letters = Arrays.asList(letter);
        return letters;
    }
}
