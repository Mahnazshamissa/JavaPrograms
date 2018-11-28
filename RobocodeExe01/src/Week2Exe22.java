import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Week2Exe22 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<String>();
        List<String> rooms = new ArrayList<String>();
        names.add("Derek");
        names.add("Matilda");
        names.add("Hansel");

        rooms.add("Living room");
        rooms.add("Studio");
        rooms.add("Bathroom");



        System.out.println(" Please, give me a number");
        Scanner scanner = new Scanner(System.in);
        Integer number1 = scanner.nextInt();
        System.out.println(" Please, give me a number");
        Integer number2 = scanner.nextInt();
        System.out.println(" Please, give me a number");
        Integer number3 = scanner.nextInt();
        Integer number = number1 * number2 * number3 * 199;
        String person1 = names.get(number % 3);
        names.remove(number % 3);

        System.out.println(person1 +" gets room" + rooms.get(0));
        rooms.remove(0);


        String person2 = names.get(number % 2);
        names.remove(number % 2);

        System.out.println(person2 +" gets room" + rooms.get(0));
        rooms.remove(0);

        String person3 = names.get(0);
        names.remove(0);

        System.out.println(person3 +" gets room" + rooms.get(0));
        rooms.remove(0);


    }
}

/*
say​ (“Please, give me a number”)
Number number1 ​ = listen​ ()
say​ (“Please, give me a number”)
Number number2 ​ = listen​ ()
say​ (“Please, give me a number”)
Number number3 ​ = listen​ ()
Number number ​ = ​ number1 ​ * ​ number2 ​ * ​ number3 ​ * ​ 199
Number personNumber ​ = ​ number ​ % ​ 3
String person1 ​ = ​ names.​ get​ (personNumber)
names ​ = ​ names.​ remove​ (personNumber)
say​ (person1 ​ + ​ “ gets room “ ​ + ​ rooms.​ get​ (0) )
rooms.​ remove​ (0)

personNumber ​ = ​ number ​ % ​ 2
String person2 ​ = ​ names.​ get​ (personNumber)
names ​ = ​ names.​ remove​ (personNumber)
say​ (person2 ​ + ​ “ gets room “ ​ + ​ rooms.​ get​ (0) )
rooms.​ remove​ (0)

String person3 ​ = ​ names.​ get​ (0)
names ​ = ​ names.​ remove​ (0)
say​ (person3 ​ + ​ “ gets room “ + rooms.​ get​ (0) )
rooms.​ remove​ (0)
 */