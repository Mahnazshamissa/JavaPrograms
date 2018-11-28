import java.util.ArrayList;
import java.util.List;

public class Week2Exe17 {
    public static void main(String[] args) {
        String message = "PLEASE NO ADVERTISEMENT";
        System.out.println(message);
        System.out.println(message.toLowerCase());


        List<String> newMessage = new ArrayList<String>();
        newMessage.add("PLEASE");
        newMessage.add("NO");
        newMessage.add("ADVERTISEMENT");


        for (int position = 0; position < 3; position++) {

            String word = newMessage.get(0);
            newMessage.remove(0);
            System.out.println(word.toLowerCase());

        }

    }
}

/*
String message = “PLEASE NO ADVERTISEMENT”
message ​ = ​ message.​ lowerCase​ ()
Part B
Collection of String words ​ = ​ [“PLEASE”, “NO”, “ADVERTISEMENT”]
String word ​ = ​ words.​ get​ (0)
words ​ = ​ words.​ remove​ (0)
word ​ = ​ word.​ lowerCase​ ()
words ​ = ​ words.​ add​ (word)
 */