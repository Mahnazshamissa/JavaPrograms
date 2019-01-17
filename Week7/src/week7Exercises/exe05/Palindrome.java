package week7Exercises.exe05;

public class Palindrome {
    public String isPalindrome(String word) {
        SpaceRemover spaceRemover = new SpaceRemover();
        String noSpaceword = spaceRemover.removeSpace(word);

        String notPalindrome = "The Word is Not Palindrome";
        String isPalindrome = "The word is Palindrome";

        if (noSpaceword.length() < 2) {
            return notPalindrome;
        }
        Integer left = 0;
       // Integer right = noSpaceword.length() - 1;
        Integer right = noSpaceword.length();

        while (left <= right) {
            String leftCharacter = noSpaceword.substring(left, left + 1);
            String rightCharacter = noSpaceword.substring(right - 1, right);
            if (!leftCharacter.equalsIgnoreCase(rightCharacter)) {
                return notPalindrome;
            }
            left++;
            right--;
        }
        return isPalindrome;
    }

}
