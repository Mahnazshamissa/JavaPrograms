package week5Exersices.exe06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WardrobeBuilder {

    private Step bottom = new AddBottom();
    private Step side = new AddSide();
    private Step back = new AddBack();
    private Step top= new AddTop();
    private Step shelf = new AddShelf();
    private Step door = new AddDoor();

    List<Step> steps =Arrays.asList(bottom,side,side,back,top,shelf,shelf,shelf,shelf,shelf,shelf,shelf,shelf,door,door);

   // List<Step> steps = new ArrayList<>();
    // steps nemiad ke add konim


    public Wardrobe build(){
        Wardrobe wardrobe = new Wardrobe();
        for (Step step : steps) {
            step.perform(wardrobe);

        }
        return wardrobe;
    }

}


/*
Create the WardrobeBuilder class that has a list of all the Steps
it has to follow to build a wardrobe. It has the build method.
It creates an empty Wardrobe and applies all the steps one by one
to it until it’s finished and then it returns it.
A Wardrobe needs the following to be completed:
 one bottom, two sides, one back, one top, eight shelves and two doors.

 */