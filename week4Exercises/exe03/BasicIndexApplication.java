package week4Exercises.exe03;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BasicIndexApplication {

    public static void main(String[] args) {

        Map<Integer, String> index = new HashMap<>();
        System.out.println("The first map of index is : " + index);

        index.put(1,"connecting");
        index.put(2, "possitive things");
        index.put(3, "ecologic economy");
        System.out.println("The index with three different items : " + index);

        Set <Integer> keys= index.keySet();
        System.out.println("Index keys: "+ keys);

        Collection <String> values= index.values();
        System.out.println("Index values: "+ values);

        System.out.println("Index entry sets: " + index.entrySet());

        //Set<Map.Entry<Integer, String>> bookTopics = index.entrySet();

       // for (Map.Entry<Integer, String> bookTopic : bookTopics) {
           // Integer key = bookTopic.getKey();
           // String value = bookTopic.getValue();

           // System.out.println(key+ "=" +value);

       // }


        index.put(1, "Physics");
        System.out.println("New index is: "+ index);

        if (index.containsKey(1)){
            System.out.println("The page number 1 exists as key.");
        }



        System.out.println("The topic in page number 3 is " + index.get(3));



        System.out.println("Index size : "+ index.size());

       // System.out.println(index.entrySet());



    }
}


/*
write the following instructions in its main method:
Create an empty index map connecting Integers for the page numbers and Strings
for the book topics and display it.
Create three Integers that represent three different page numbers.
Create three Strings that represent three different book topics.
Put them into the index map from biggest to smallest page number and display it
to notice that the entries are automatically arranged.
Display the map keys.
Display the map values.
Create one String representing another book topic.
Put this new topic into the same page number than an existing one and display
the map to notice that the previous one is replaced.
Ask if one of the keys is contained in the map and display the answer.
Get one of them by providing its name as an argument and display it.
Display its size.


 */