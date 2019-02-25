package exe03.partAWithInterfaceAndStream;

import java.time.LocalTime;

public class BeforThirty implements TimeInHourAndMinute {
    @Override
    public String getTimeAsString(Integer hour,Integer minute) {
        return ConvertNumberToWord.getWord(minute) + " minutes past " + ConvertNumberToWord.getWord(hour) ;
    }

    @Override
    public Boolean isRightCase(Integer hour,Integer minute) {
        return minute <30 && minute!=0;
    }
}
