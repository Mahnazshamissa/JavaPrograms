package exe02.withFormatter;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class MilitaryTimeExchanger {
    private DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("hh:mm:ssa");
    private DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("HH:mm:ss");



    public String toMilitaryTime(String input) {

        LocalTime inputTime = LocalTime.parse(input, inputFormat);
        String output = outputFormat.format(inputTime);
        return output;
    }
}
