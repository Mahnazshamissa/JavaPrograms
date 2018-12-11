package week5Exersices.exe03;

import week5Exersices.exe01.Shape;

public class Rectangle implements Colored, Shape {

    @Override
    public String getColor() {

        return "Darkgreen";
    }


    @Override
    public String getName() {
        return "rectangle";
    }

    @Override
    public String toString() {
        return getColor() + " " + getName();
    }
}

/*
Create the Rectangle class that implements the Colored interface.
Implement the getColor method with the help of Intellij.
Return the color of your choice in that method.

 */