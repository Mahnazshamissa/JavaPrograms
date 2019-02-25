package exe03.partAWithInterfaceAndStream;

import java.time.LocalTime;

public interface TimeInHourAndMinute {
    String getTimeAsString(Integer hour,Integer minute);

    Boolean isRightCase(Integer hour,Integer minute);
}
