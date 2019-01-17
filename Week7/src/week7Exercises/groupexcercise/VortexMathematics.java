package week7Exercises.groupexcercise;

import week7Exercises.groupexcercise.vortex.Participant;
import week7Exercises.ref7Solution.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VortexMathematics {
    private FileReader reader = new FileReader();

   /* public List<Participant> getParticipant(String path){

        List<Participant> participants = new ArrayList<>();
        List<String> participantLine = reader.asLines(path);
        for (String line : participantLine) {
            Participant participant = getParticipant(line);
            participants.add(participant);
        }

        return participants;
    }*/




    public Participant getParticipant(String line){
        String[] part = line.split(";");
        List<String> parts = Arrays.asList(part);
        String name = parts.get(0);
        String department = parts.get(1);
        String salaryString = parts.get(2);
        Integer salary = Integer.valueOf(salaryString);
        String bankAcount = parts.get(3);
        Participant participant = new Participant(name);
        return participant;
    }

}
