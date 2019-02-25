package exe03.partAWithInterfaceAndStream;

import java.time.LocalTime;

public class AfterThirty implements TimeInHourAndMinute {
    @Override
    public String getTimeAsString(Integer hour,Integer minute) {
        return ConvertNumberToWord.getWord(60-minute) + " minutes to " + ConvertNumberToWord.getWord(hour+1) ;
    }

    @Override
    public Boolean isRightCase(Integer hour,Integer minute) {
        return minute>30 ;
    }
}
