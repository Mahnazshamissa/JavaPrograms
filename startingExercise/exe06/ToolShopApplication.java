package startingExercise.exe06;

import javax.tools.Tool;
import java.util.ArrayList;

public class ToolShopApplication {

    public static void main(String[] args) {

        ArrayList<Tool> tools = new ArrayList<>();
       // tools.add(Hammer);


    }
}

/*

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToolShopApplication {
    public static void main(String[] args) {

        List<String> tools = Arrays.asList("hammer", "pliers", "wrench").stream().collect(Collectors.toList());
        ShopAssistant shopAssistant = new ShopAssistant();
        shopAssistant.findToolBox("red", tools);
    }

}



 */

/*
In the ToolShopApplication class main method,
create a list of String with three tool names inside,
create a ShopAssistant and use it to find a red Toolbox with those three tools inside.

 */