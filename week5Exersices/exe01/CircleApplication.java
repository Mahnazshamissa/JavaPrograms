package week5Exersices.exe01;

public class CircleApplication {
    public static void main(String[] args) {


        Circle circle = new Circle();
        System.out.println("Class: "+ circle.getName());


        //Shape shape = new Circle();
        Shape shape = circle;
        System.out.println("Shape: "+ shape.getName());

        Shape anotherShape = new Circle();
        //Shape anotherShape = circle;
        System.out.println("Another shape: "+ anotherShape.getName());






    }
}

/*
Create a Circle and display its name.

In a new line, assign the circle variable to a Shape variable
called shape. Just use the = symbol. Display the shape’s name.

Create another Circle, but this time assign it directly to
a Shape with the name anotherShape. Display anotherShape’s name.

Create the CircleTest class that tests that the Circle
is working correctly as both Circle and Shape.


 */