package week4Exercises.exe07;

import week4Exercises.exe06.Item;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdvancedIndexApplication {

    public static void main(String[] args) {

        Map<Integer, List<Topic>> index = new HashMap<>();
        System.out.println("Index : " + index);

        Topic connecting = new Topic("connecting");
        Topic possitiveThings = new Topic("possitive things");
        Topic ecologicEconomy = new Topic("ecologic economy");

        List<Topic> topics1 = new ArrayList<>();
        topics1.add(connecting);

        List<Topic> topics2 = new ArrayList<>();
        topics2.add(possitiveThings);
        topics2.add(ecologicEconomy);

        index.put(1,  topics1);
        index.put(2,  topics2);

        System.out.println("Index : " + index);




        System.out.println("Index keys : " + index.keySet());
        System.out.println("Index values : " + index.values());


        System.out.println("Index entry sets: " + index.entrySet());

        Topic physics = new Topic("Physics");
        topics1.add(physics);

        index.put(1,topics1);
        System.out.println("New index is: "+ index);

        if (index.containsKey(1)){
            System.out.println("The page number 1 exists as key.");
        }



        System.out.println("The topics in page number 2 are "+ index.get(2));



        System.out.println("Index size : "+ index.size());



    }

}
/*
Get the ​ topics1 ​ from the map and call it ​ stored . ​ Add to ​ stored ​ the last ​ Topic ​ you created. Display the map.
● Ask if one of the keys is contained in the map and display the answer.
● Get the ​ topics2 ​ from the map and call it ​ stored2 ​ and display it.
 */