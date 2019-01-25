package exe02;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentsSummarizer {

    private StudentsReader studentsReader = new StudentsReader();
    private List<Student> students = studentsReader.getStudents("exe02/students-performance.csv");



    public List<String> getParentalLevelsOfEducation() {
        return students.stream()
                .map(e -> e.getParentalLevelOfEducation())
                .collect(Collectors.toList());
    }

    Map<String, Long> parentLevelAppearances = getParentalLevelsOfEducation().stream()
            .collect(Collectors.groupingBy(e -> e, Collectors.counting()));


    public List<String> sortedParentLevelAppearances() {
        return parentLevelAppearances.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getKey() + " | " + e.getValue())
                .collect(Collectors.toList());
    }

    public Long numberOfHeighLevelAndLower60Score = students.stream()
            .filter(e->e.getMathScore()<60)
            .filter(e->e.getReadingScore()<60)
            .filter(e->e.getWritingScore()<60)
            .map(e->e.getParentalLevelOfEducation())
            .filter(e->e.equals("master's degree"))
            .count();

     public List<String> get3TopScoreWithGender(){
         return students.stream()
                 //.sorted(Comparator.comparing(Student::getMathScore).reversed())
                 .map(e-> (e.getMathScore() + e.getWritingScore()+e.getReadingScore())/3 + " | " + e.getGender())
                 .sorted(Comparator.reverseOrder())
                 .limit(3)
                 .collect(Collectors.toList());

     }


    boolean isStudentAnyHighSchoolParentalScore95 = students.stream()
            .filter(e->e.getParentalLevelOfEducation().equals("some high school"))
            .filter(e-> e.getMathScore()>=95)
            .filter(e-> e.getReadingScore()>=95)
            .filter(e-> e.getWritingScore()>=95)
            //.anyMatch(e->e.equals("some high school"));
            .count() > 0;

     //instead of anyMatch we can use first filter with count




}


/*
How many boys and girls are there?
Which are the distinct parental levels of education sorted alphabetically?
How many students scored higher than a 90 on every topic?
How many students scored exactly 100 on every topic? Which ones are their genders?

 */