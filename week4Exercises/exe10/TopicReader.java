package week4Exercises.exe10;

import week4Exercises.exe07.Topic;
import week4Exercises.exe09.FileReader;

import java.util.ArrayList;
import java.util.List;

public class TopicReader {

    private FileReader fileReader =new FileReader();


    public  List<Topic> getTopic(FileReader fileReader){


        List<String> lines = fileReader.asLines("week4Exercises/exe10/topics.txt");
        List<Topic> topics = new ArrayList<>();

        for (String line : lines) {
            topics.add(new Topic(line));
            //System.out.println(line);
        }
        return topics;

    }
}


//Create the TopicReader class that has a FileReader as an attribute.
// It has the getTopics method that uses the File Reader
// to read the topics.txt file, transform every line into one Topic
// and returns the list of topics.