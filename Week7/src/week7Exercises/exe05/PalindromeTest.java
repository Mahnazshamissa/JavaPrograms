package week7Exercises.exe05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    SpaceRemover spaceRemover = new SpaceRemover();
    Palindrome palindrome = new Palindrome();

    @Test
    void SpaceRemover() {
        String testInput = "A min ";
        String noSpace = spaceRemover.removeSpace(testInput);

        String expected = "Amin";
        assertEquals(expected, noSpace);
    }

    @Test
    void Palindrome() {
        String testInput = "M adam";
        String noSpace = spaceRemover.removeSpace(testInput);
        String palindrome1 = palindrome.isPalindrome(noSpace);

        String expected = "The word is Palindrome";

        assertEquals(expected, palindrome1);
    }

    @Test
    void NotPalindrome() {
        String testInput = "AA MMi NN";
        String noSpace = spaceRemover.removeSpace(testInput);
        String palindrome1 = palindrome.isPalindrome(noSpace);

        String expected = "The Word is Not Palindrome";

        assertEquals(expected, palindrome1);
    }


}