package week6Exercises.exe02;

public class IceCreamApplication {

    public static void main(String[] args) {

        IceCream cone = new ConeIceCream("Chocolate", "Oreo");
        System.out.println(cone.eat());

        IceCream cup = new CupIceCream("Vanilla", "Cookies");
        System.out.println(cup.eat());


    }
}

/*
Create a ConeIceCream as an IceCream,
name it cone and display the eat message.

Create a CupIceCream as an IceCream,
name it cup and display the eat message.

 */