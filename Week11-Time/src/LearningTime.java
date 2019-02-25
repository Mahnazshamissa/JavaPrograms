import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Locale;

public class LearningTime {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);

        ZoneId here= ZoneId.systemDefault();
        System.out.println(here);

        System.out.println(now.atZone(here));
        System.out.println(now.getNano());
        System.out.println(now.getEpochSecond());

        Locale language = Locale.getDefault();  //Locale say the language of computer or place
        System.out.println(language);

        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate todayClock = LocalDate.now();
        System.out.println(todayClock);

        LocalDate todayZoneId = LocalDate.now();
        System.out.println(todayZoneId);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalTime timeClock = LocalTime.now();
        System.out.println(timeClock);

        LocalTime timeZoneId = LocalTime.now();
        System.out.println(timeZoneId);


    }
}
