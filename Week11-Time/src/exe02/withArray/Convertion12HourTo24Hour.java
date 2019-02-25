package exe02.withArray;

import java.util.Scanner;

public class Convertion12HourTo24Hour {

    public static void main(String[] args) {

        System.out.println("Please give your time in 12 hours with AM or PM");
        String time = toMilitaryTime();
        System.out.println("Your time in 24 hours is: " + time);
    }

    private static String toMilitaryTime() {
        Scanner scanner = new Scanner(System.in);
        String time = scanner.next();

        if(time.contains("AM")){
            time = time.replace("AM", "");
            String[] timeArr = time.split(":");
            if(timeArr[0].equals("12")){
                timeArr[0] = "00";
            }
            time = timeArr[0]+":"+timeArr[1]+":"+timeArr[2];
        }
        else if(time.contains("PM")){
            time = time.replace("PM", "");
            String[] timeArr = time.split(":");
            if(!timeArr[0].equals("12")){
                timeArr[0] = Integer.toString(Integer.parseInt(timeArr[0])+12);
            }
            time = timeArr[0]+":"+timeArr[1]+":"+timeArr[2];
        }
        return time;
    }




    // private static final int AM = 0;
    // private static final int PM = 1;

    /* private int get24FormatHour(int hour12Format,int amPm){

          if(hour12Format==12 && amPm==AM){
              hour12Format=0;
          }
          if(amPm == PM && hour12Format!=12){
              hour12Format+=12;
          }
          return hour12Format;
        }*/


}

