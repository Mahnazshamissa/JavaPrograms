package week4Exercises.exe10;

import week4Exercises.exe07.Topic;
import week4Exercises.exe09.FileReader;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TopicReaderApplication {

    public static void main(String[] args) {

        FileReader fileReader = new FileReader();
        TopicReader reader = new TopicReader();

        List<Topic> topics = new ArrayList<>();
        topics= reader.getTopic(fileReader);

        for (Topic topic : topics) {
            System.out.println("Topic list: " + topic);
        }



        Set<Topic> elements = new HashSet<>(topics);
        for (Topic element : elements) {

            System.out.println("Topic set : "+ element);
        }

    }
}


/*
In the TopicReaderApplication class main method,
create a TopicReader, use the getTopics method and
place them inside a list. Display the list of topics.
Create a set of Topic, add the elements of the previous list
and display it to notice that there happens to be duplicates.
To ensure uniqueness you have to create the equals method
in the Topic class. Do this and run the program again
to make sure the set does not display any duplicates.

 */