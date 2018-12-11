package week5Exersices.exe07;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DecisionMaker {

    public void displayWinner(String humanChoice, String computerChoice){

        if (humanChoice.equals("paper")){
            if(computerChoice.equals("rock")){
                System.out.println("Player1 wins!");
            } else if (computerChoice.equals("scissors")){
                System.out.println("Player2 wins!");

            } else {
                System.out.println("You are equal!");

            }
        }

        if (humanChoice.equals("rock")){
            if(computerChoice.equals("scissors")){
                System.out.println("Player1 wins!");
            } else if (computerChoice.equals("paper")){
                System.out.println("Player2 wins!");

            } else {
                System.out.println("You are equal!");

            }
        }

        if (humanChoice.equals("scissors")){
            if(computerChoice.equals("paper")){
                System.out.println("Player1 wins!");
            } else if (computerChoice.equals("rock")){
                System.out.println("Player2 wins!");

            } else {
                System.out.println("You are equal!");

            }
        }
    }

    //private Player human = new Human();
    //private Player computer = new Computer();
    //private Move move1=

    //List<Player> players = Arrays.asList(human, computer);
    //List<Move> moves= Arrays.asList(rock)

   // public Player judge(){

       // Random random = new Random();
       // Integer randomPlayer = random.nextInt(2);
       // return players.get(randomPlayer);


        //if ()

       // human.playGame(human);
        //computer.playGame(computer);

    //}


}

//Rock defeats scissors. Scissors defeats paper. Paper defeats rock.