import java.util.Scanner;

public class Week2Exe18 {
    public static void main(String[] args) {
        System.out.println("Please write your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String lower= name.toLowerCase();

        int length= name.length();
        char fUpper= Character.toUpperCase(lower.charAt(0));
        char lUpper= Character.toUpperCase(lower.charAt(length-1));
        //lower=lower.replace(lower.charAt(0),fUpper);
        //lower=lower.replace(lower.charAt(length-1),lUpper);
        String newName="";

        for (int position = 1; position <length-1; position++) {
        char newChar = lower.charAt(position);
        String newchar=Character.toString(newChar);
         newName =newName.concat(newchar);
           // System.out.println(newName);

        }

        System.out.println(newName);

        //System.out.println(lower);



    }
}

/*
action​ formatToBracketsCI(String word) ​ returns​ String
Number length ​ = ​ word.​ size​ ()
String firstLetter ​ = ​ word.​ get​ (0)
firstLetter ​ = ​ firstLetter.​ upperCase​ ()
String lastLetter ​ = ​ word.​ get​ (length ​ - ​ 1)
lastLetter ​ = ​ lastLetter.​ upperCase​ ()
String middle ​ = ​ word.​ section​ (1, length ​ - ​ 2)
middle = middle.lowerCase()
String transformedWord ​ = ​ firstLetter ​ + ​ middle ​ + ​ lastLetter
return​ transformedWord
 */