package exe03.partAWithInterfaceAndStream;

import java.time.LocalTime;

public class ZeroMinutes implements TimeInHourAndMinute {
    @Override
    public String getTimeAsString(Integer hour,Integer minute) {
        return ConvertNumberToWord.getWord(hour)+ " o' clock";
    }

    @Override
    public Boolean isRightCase(Integer hour,Integer minute) {
        return minute==0;
    }
}
