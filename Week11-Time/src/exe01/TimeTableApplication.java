package exe01;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TimeTableApplication {
    public static void main(String[] args) {

        LocalTime time= LocalTime.parse("10:00:00");
        LocalDate date = LocalDate.parse("2003-03-13");
        LocalDateTime dateTime = LocalDateTime.parse("2003-03-13T10:00:00");
        // or
        LocalDateTime dateTime2 = LocalDateTime.of(date,time);
        System.out.println("Date: " + date+ " , time:" + time);
        System.out.println("Date and time together: "+dateTime);
        System.out.println("Date and time together2: "+dateTime2);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        String wakeUpTime = time.format(formatter);
        System.out.println("Matilda wakes up at: " + wakeUpTime + " o' clock.");

        LocalTime timeReady = LocalTime.from(time).plusMinutes(37).plusSeconds(21);
        System.out.println("She is ready at : " + timeReady);

        LocalTime timeInAirport = LocalTime.from(timeReady).plusHours(1).plusMinutes(30);
        System.out.println("She arrives at airport: " + timeInAirport);

        LocalTime departure = LocalTime.parse("11:04");
        System.out.println("The departure time of his flight:" +departure);
        System.out.println("Is arriving before the departure ? " +departure.isAfter(timeInAirport));

        System.out.println("Did he miss his flight ? "+ departure.isBefore(timeInAirport));

        LocalTime nextFlight = LocalTime.parse("18:45");
        System.out.println("Next flight is at : " + nextFlight);

        Duration waitingTime = Duration.between(timeInAirport, nextFlight);
        System.out.println("She should wait till next flight : " + waitingTime.toHours()+ " hours and " + waitingTime.minusHours(waitingTime.toHours()).toMinutes() + " minutes.");
        System.out.println("She should wait till next flight : " + waitingTime.toMinutes() /60+ " hours and " + waitingTime.toMinutes()%60 + " minutes.");

        LocalDateTime arrival = LocalDateTime.of(date,nextFlight).plusHours(11).plusMinutes(50);
        System.out.println("Her flight lands in Tokyo at : date " + arrival.toLocalDate() + " and time "+ arrival.toLocalTime() + " of London time." );
        ZoneId london = ZoneId.of("Europe/London");
        ZonedDateTime arrivalLondonTime = arrival.atZone(london);

        ZoneId tokyo = ZoneId.of("Asia/Tokyo");
        ZonedDateTime arrivalTokyoTime = arrivalLondonTime.withZoneSameInstant(tokyo);
        System.out.println("Her flight lands in Tokyo at : date " + arrivalTokyoTime.toLocalDate() + " and time "+ arrivalTokyoTime.toLocalTime() );

        LocalTime arriveHotel = LocalTime.from(arrivalTokyoTime).plusHours(2);
        System.out.println("She srrives hotel at : " + arriveHotel);

        LocalTime wakeUpAtHotel = LocalTime.from(arriveHotel).plusHours(9);
        System.out.println("She wakes up with her manager hitting her in the head with the pillows at : " + wakeUpAtHotel);

        LocalTime startAdvertisement = LocalTime.from(wakeUpAtHotel).plusMinutes(47);
        System.out.println("The advertisement shooting starts at : " + startAdvertisement);

        LocalTime privateCall= LocalTime.from(wakeUpAtHotel).plusSeconds(546);
        Duration speakingTime =Duration.between(wakeUpAtHotel,privateCall);
        System.out.println("Her Tel with her Katinka lasts : " + speakingTime.toMinutes()+ " minutes and "
                + speakingTime.minusMinutes(speakingTime.toMinutes()).getSeconds()+ " seconds.");

        Duration preparationInLimousine = Duration.between(privateCall,startAdvertisement);
        System.out.println("She has to get prepared in the limousine in "
                + preparationInLimousine.toMinutes()+ " minutes and "
                + preparationInLimousine.minusMinutes(preparationInLimousine.toMinutes()).getSeconds() + " seconds.");

        LocalTime shootingOver = LocalTime.from(startAdvertisement).plusHours(7);
        System.out.println("Shooting is over at : " + shootingOver);

        LocalTime lunchTime = LocalTime.parse("13:00");
        LocalTime dinnerTime = LocalTime.parse("20:00");
        boolean isLunchTime = shootingOver.isBefore(lunchTime);

        if (isLunchTime) {
            System.out.println("She should have lunch.");
        } else {

            System.out.println("She should have dinner.");
        }

        LocalDateTime backFlight = LocalDateTime.from(arrivalTokyoTime).plus(3, ChronoUnit.DAYS).plusHours(30).plusMinutes(47);
        System.out.println("The flight back to London is at : " + backFlight.toLocalDate() + " date and " + backFlight.toLocalTime() +" time of Tokyo.");

        LocalDateTime landInLondon = LocalDateTime.from(backFlight).plusHours(11).plusMinutes(50);
        System.out.println("She lands at date "+landInLondon.toLocalDate()+ " and time " + landInLondon.toLocalTime()+" time of Tokyo." );
        System.out.println("She lands in london at "+ landInLondon.toLocalTime()+ " time of Tokyo.");

        ZonedDateTime backTokyoTime =landInLondon.atZone(tokyo);
        System.out.println("Her flight lands in london at "+ backTokyoTime.toLocalTime() + " time of Tokyo.");
        System.out.println("Her flight lands in london at "+ backTokyoTime.toLocalDate() + " date of Tokyo.");

        ZonedDateTime backLondonTime =backTokyoTime.withZoneSameInstant(london);
        System.out.println("Her flight lands in london at " + backLondonTime.toLocalDate()+ " date of london.");
        System.out.println("Her flight lands in london at " + backLondonTime.toLocalTime()+ " time of london.");

        long dispatchingTime = 173 * 12;
        Instant begin = Instant.now();
        Instant end = begin.plusSeconds(dispatchingTime);
        Duration dispatchingDuration = Duration.between(begin, end);
        System.out.println("Dispatching time is " +dispatchingTime+ " seconds.");
        System.out.println("She spent " + dispatchingDuration.toHours()+ " hours and "
                + dispatchingDuration.minusHours(dispatchingDuration.toHours()).toMinutes() + " minutes with her fans.");


        LocalTime timeArriveInHotel = LocalTime.from(backLondonTime).plusHours(1).plusMinutes(34);
        System.out.println("She arrives at her hotel in london at "+ timeArriveInHotel);

        boolean isAfter09 = timeArriveInHotel.isAfter(LocalTime.parse("09:00:00"));
        boolean isbefore14Ending = timeArriveInHotel.isBefore(LocalTime.parse("13:30:00"));

        boolean isAfter16 = timeArriveInHotel.isAfter(LocalTime.parse("16:00:00"));
        boolean isBefore20Ending = timeArriveInHotel.isBefore(LocalTime.parse("19:30:00"));

        if (isAfter09 && isbefore14Ending) {
            System.out.println("he can spend half an hour in sauna!");
        } else if (isAfter16 && isBefore20Ending) {
            System.out.println("he can spend half an hour in sauna!");
        } else {
            System.out.println("he can not spend half an hour in sauna!");

        }

        LocalDateTime londonHotel = LocalDateTime.from(backLondonTime).plusHours(1).plusMinutes(34);
        DayOfWeek dayOfWeek = landInLondon.getDayOfWeek();
        System.out.println("She arrives in hotel on "+ dayOfWeek);

        LocalDate dateOfInHotel =londonHotel.toLocalDate();
        boolean leapYear = dateOfInHotel.isLeapYear();

        if (dayOfWeek.toString().equalsIgnoreCase("Thursday") && dayOfWeek.toString().equalsIgnoreCase("Sunday") || leapYear && dayOfWeek.toString().equalsIgnoreCase("Saturday")) {
            System.out.println("She is lucky and get one hour massage!");
        } else {
            System.out.println("She is not lucky to get one hour massage!");
        }

        LocalDateTime timeInLondonInDayOfAdvertisment = londonHotel.plusWeeks(1);
        System.out.println("Time in london :" + timeInLondonInDayOfAdvertisment);

        ZonedDateTime timeAtZoneLondon = timeInLondonInDayOfAdvertisment.atZone(london);
        ZonedDateTime timeAZoneTokyo = timeAtZoneLondon.withZoneSameInstant(tokyo);

        Duration timeToAdvertisment = Duration.between(timeAZoneTokyo.toLocalTime(), LocalTime.parse("18:30:00"));
        LocalDateTime adShowTimeInLondon = timeInLondonInDayOfAdvertisment.plus(timeToAdvertisment);

        System.out.println("Advertisement show in Tokyo: 18:30");
        System.out.println("Advertisement show in London " + adShowTimeInLondon.toLocalTime());

        LocalDateTime congratsCallTime = adShowTimeInLondon.plusSeconds(29).plusSeconds(15);
        System.out.println("Congrats call time: " + congratsCallTime.toLocalTime());
        System.out.println("Weekday is: "+congratsCallTime.getDayOfWeek());

        Period daysFromBeginToEnd = Period.between(date,congratsCallTime.toLocalDate());
        System.out.println("It takes "+daysFromBeginToEnd.getDays()+" days.");

        LocalDateTime endOfTimeTable = congratsCallTime.minusMinutes(9).minusSeconds(21);
        Duration timeSheet = Duration.between(LocalDateTime.of(date, time), endOfTimeTable);
        long workingMinutes = timeSheet.toMinutes();
        System.out.println("She worked "+workingMinutes+" minutes.");

        double salary = workingMinutes * 1.39;
        System.out.println("Her salary is : "+salary+" €");





    }

}
