package week5Exersices.exe07;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Computer implements Player {

    @Override
    public String getName() {

        return "Player2";
    }

    @Override
    public String getChoice() {
        Random random = new Random();
        int randomMove = random.nextInt(3);
        List<String> moves = Arrays.asList("rock", "scissors", "paper");
        return moves.get(randomMove);
    }

   // @Override
    //public void playGame(Player player) {

    //}

    //@Override
    //public String toString() {
      //  return "Computer";
    //}
}
