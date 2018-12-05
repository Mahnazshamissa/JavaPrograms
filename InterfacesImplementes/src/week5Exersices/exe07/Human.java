package week5Exersices.exe07;

import java.util.Scanner;

public class Human implements Player {
    @Override
    public String getName() {
        return "Player1";
    }

    @Override
    public String getChoice() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    // @Override
   // public void playGame(Player player) {
        //player.playGame();
    //}

   // @Override
    //public String toString() {
      //  return "Human";
    //}
}
