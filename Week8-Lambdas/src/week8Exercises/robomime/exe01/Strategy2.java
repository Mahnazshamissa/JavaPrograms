package week8Exercises.robomime.exe01;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Strategy2 implements Decryption {

    String reversedLine = "";

    @Override
    public boolean canDecrypt(String line) {
        return line.contains("&");
    }

    @Override
    public String getStrategies(String line) {
        String lineWithoutRubbish = removeRubbish(line);
        String[] split = lineWithoutRubbish.split("");
        List<String> newLine = Arrays.asList(split);
        //Collection<String> letters = split.re
        return reverseLine(newLine);
    }


    private String removeRubbish(String line) {
        line = line.replaceAll("&", "");
        return line;
    }

    private String reverseLine(List<String> line) {
        for (int position = line.size() - 1; position >= 0; position--) {
            reversedLine += line.get(position);
        }
        return reversedLine;

    }
}
