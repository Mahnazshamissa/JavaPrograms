package week7Exercises.exe05;

public class SpaceRemover {
    public String removeSpace(String word){
        String noSpace = word.replaceAll(" ", "");
        return noSpace;
    }
}
