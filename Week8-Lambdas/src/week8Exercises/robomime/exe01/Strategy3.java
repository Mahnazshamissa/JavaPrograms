package week8Exercises.robomime.exe01;

public class Strategy3 implements Decryption {


    @Override
    public boolean canDecrypt(String line) {
        return line.contains("#");
    }

    @Override
    public String getStrategies(String line) {
        String lineWithoutRubbish= removeRubbish(line);
        return removeRobomime(lineWithoutRubbish);
    }


    private String removeRubbish(String line) {
        line = line.replaceAll("#", "");
        return line;
    }

    private String removeRobomime(String line) {
        line = line.replaceAll("robomime", "");
        return line;
    }
}
