package week5Exersices.exe03;

import week5Exersices.exe01.Shape;

import java.util.ArrayList;
import java.util.List;

public class BasicColorApplication {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        System.out.println("Color: " + rectangle.getColor());
        System.out.println("Name: " + rectangle.getName());

        Colored colored = (Colored) rectangle;
        System.out.println("Colored: " + colored.getColor());
        //System.out.println("Colored: " + colored.getName());

        Shape shape = (Shape) rectangle;
        System.out.println("Shape: " + shape.getName());
        //System.out.println("Shape: " + rectangle.getName());

        List<Rectangle> rectangles= new ArrayList<>();
        rectangles.add(rectangle);
        //rectangles.add(colored);
        //rectangles.add(shape);


        List<Colored> coloreds = new ArrayList<>();
        coloreds.add(rectangle);
        coloreds.add(colored);
        //coloreds.add(shape);


        List<Shape> shapes = new ArrayList<>();
        shapes.add(rectangle);
        shapes.add(shape);
        //shapes.add(colored);

        System.out.println(rectangles);
        System.out.println(coloreds);
        System.out.println(shapes);









    }
}


/*
Create a Rectangle as a normal Rectangle,
name it rectangle and display its color.
Add the Shape interface to the Rectangle class.
Don’t replace Colored. Just place a comma after Colored
and add Shape right afterwards.
Implement the getName method with the help of Intellij.
Return the word rectangle in that method.
Reuse the Shape interface from exercise 1.

Display the rectangle’s name.
In a new line, write the following:
Colored colored = (Colored) rectangle;
This is called casting.
Now the rectangle is no longer a Rectangle,
but it is a Colored object. Display its color.
Note that you cannot see any more the getName method
because the Colored interface does not have it.

In a new line, write the following:  Shape shape = (Shape) rectangle;
This is called casting. Now the rectangle is no longer a Rectangle,
but it is a Shape object. Display its name.
Note that you cannot see any more the getColor method
because the Shape interface does not have it.

Create a list of Rectangle called rectangles and add the rectangle.
Note that you cannot add either colored or shape
because they are not Rectangles.

Create a list of Colored called coloreds and add rectangle
and colored to it.
Note that you cannot add shape because it’s not a Colored object.

Create a list of Shape called shapes and add rectangle and shape to it.
Note that you cannot add colored because it’s not a Shape object.

Add the toString method to the Rectangle.
Make sure you use its interface methods to return its color
and name as a String. Display the three lists
Create the RectangleTest class that tests that the Rectangle is working correctly as Rectangle, Colored and Shape.

 */