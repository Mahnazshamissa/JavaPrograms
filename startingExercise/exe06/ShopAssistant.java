package startingExercise.exe06;

import javax.tools.Tool;
import java.util.List;

public class ShopAssistant {

    public ToolBox findToolbox(String color, List<String> toolNames){

        ToolBox toolBox = new ToolBox(color);

        for (String toolName : toolNames){

            //Tool tool = new Tool(toolName);
            //toolBox.add(tool);

        }

        // System.out.println("Which color do you want?");

        return toolBox;

    }


}

/*

public class ShopAssistant {
    public ToolBox findToolBox(String color, List<String> toolNames){
        ToolBox toolBox = new ToolBox(color);
        for(String name : toolNames){
            toolBox.add(new Tool(name));
        }
        System.out.println("Your "+color+" toolbox is ready with tolls inside of it "+toolNames.get(0)+", "+toolNames.get(1)+", "+toolNames.get(2));
        return toolBox;

    }
}

 */

/*
A ShopAssistant has no attributes.
 It has the findToolbox method that receives
 a list of String representing the names of the tools
 the customer asks for and returns a Toolbox. In order to create
 a Toolbox it creates one article per tool requested adding them
 to the Toolbox then it returns it.

 */