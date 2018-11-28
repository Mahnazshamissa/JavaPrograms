package startingExercise.exe03;

public class PaintingApplication {
    public static void main(String[] args) {

        Derek derek = new Derek();
        derek.hangPainting();

        Tool tool = new Tool("Hammer");
        derek.setTool(tool);

        derek.hangPainting();




    }
}
