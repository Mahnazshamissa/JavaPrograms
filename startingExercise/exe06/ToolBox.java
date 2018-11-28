package startingExercise.exe06;

import startingExercise.exe03.Tool;

import java.util.ArrayList;
import java.util.List;

public class ToolBox {

    private String color;
    private List<Tool> tools= new ArrayList<>();

    public ToolBox(String color) {
        this.color = color;
    }

    public void add(Tool tool){

        tools.add(tool);
    }

    public String getColor() {

        return color;
    }



    public List<Tool> getTools() {
        return tools;
    }
}
