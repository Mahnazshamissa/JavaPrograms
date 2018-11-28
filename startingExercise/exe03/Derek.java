package startingExercise.exe03;

public class Derek {

    private Tool tool;

    public void hangPainting() {
        if (canHangPainting()) {
            System.out.println("Derek can hang the painting.");
        } else {
            System.out.println("Derek is missing the hammmer.");
        }
    }


    public boolean canHangPainting() {

        //return tool.getName() == "Hammer";

        return tool !=null && tool.getName().equals("Hammer");

    }


    public void setTool(Tool tool) {
        // if (tool=="Hammer")
        this.tool = tool;
    }
}
