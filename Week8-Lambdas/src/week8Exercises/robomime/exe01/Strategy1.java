package week8Exercises.robomime.exe01;


public class Strategy1 implements Decryption {
    @Override
    public boolean canDecrypt(String line) {
        return line.contains("!");
    }

    @Override
    public String getStrategies(String line) {
        return removeRubbish(line);
    }


    private String removeRubbish(String line) {
        line = line.replaceAll("!", "");
        return line;
    }
}
