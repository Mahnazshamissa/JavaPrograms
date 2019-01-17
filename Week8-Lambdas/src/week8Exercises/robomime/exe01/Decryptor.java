package week8Exercises.robomime.exe01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Decryptor {

    List<String> lines = readLines();
    private Strategy1 strategy1 = new Strategy1();
    private Strategy2 strategy2 = new Strategy2();
    private Strategy3 strategy3 = new Strategy3();
    private List<Decryption> strategies = Arrays.asList(strategy1, strategy2, strategy3);

    private List<String> readLines() {
        FileReader reader = new FileReader();
        List<String> lines = reader.asLines("week8Exercises/robomime/exe01/robomime.txt");
        return lines;

    }

    public List<String> returnCleanTrickes() {
        List<String> cleanedLines = cleanLines(lines);
        return cleanedLines;
    }

    private List<String> cleanLines(List<String> lines) {
        List<String> trickes = new ArrayList<>();
        for (String line : lines) {
            Optional<String> trick = decrypt(line);
            trickes.add(trick.get());
        }
        return trickes;
    }

    Optional<String> decrypt(String line) {
        String decryptedLine = "";
        for (Decryption strategy : strategies) {
            if (strategy.canDecrypt(line)) {
                decryptedLine = strategy.getStrategies(line);
                return Optional.of(decryptedLine);
            }
        }
        return Optional.empty();
    }



}
