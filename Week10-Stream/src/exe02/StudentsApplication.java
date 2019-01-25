package exe02;

public class StudentsApplication {
    public static void main(String[] args) {
        StudentsSummarizer summarizer = new StudentsSummarizer();



        System.out.println("Parent education level appearances:\n" + summarizer.parentLevelAppearances);

        System.out.println("Parent education level appearances sorted top bottom:");
        summarizer.sortedParentLevelAppearances().forEach(e-> System.out.println(e));

        System.out.println("Number of students with high parent education and lower scores than 60: " + summarizer.numberOfHeighLevelAndLower60Score);

        System.out.println("Genders and average scores of the top three average score students: ");
        summarizer.get3TopScoreWithGender().forEach(System.out::println);

        System.out.println("Is there any student with a parent education level of some high school that has at least 95 in every topic?\n" + summarizer.isStudentAnyHighSchoolParentalScore95);


    }
}
