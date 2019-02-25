package exe03.partAWithInterfaceAndStream;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

public class ChooseMinutes {
    private List<TimeInHourAndMinute> minutesCases = Arrays.asList(new AfterThirty(), new BeforThirty(), new ThirtyMinutes(), new ZeroMinutes());

    public String toWord(Integer hour,Integer minute) {
        return minutesCases.stream()
                .filter(e -> e.isRightCase(hour,minute))
                .map(e -> e.getTimeAsString(hour,minute))
                .findFirst().get();

    }

}
