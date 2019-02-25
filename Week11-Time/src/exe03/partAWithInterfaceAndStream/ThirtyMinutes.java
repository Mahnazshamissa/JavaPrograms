package exe03.partAWithInterfaceAndStream;

import java.time.LocalTime;

public class ThirtyMinutes implements TimeInHourAndMinute {
    @Override
    public String getTimeAsString(Integer hour,Integer minute) {
        return "half past " + ConvertNumberToWord.getWord(hour);
    }

    @Override
    public Boolean isRightCase(Integer hour,Integer minute) {
        return minute ==30;
    }
}
