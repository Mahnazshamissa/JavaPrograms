package week5Exersices.exe07;

public class AnswerProvider {

    public String getChoiceOfHuman(){
        Human human = new Human();
        return human.getChoice();
    }

    public String getChoiceOfComputer(){
        Computer computer = new Computer();
        return computer.getChoice();
    }
}
