package week6Exercises.exe01;

public class HotAirBalloonApplication {

    public static void main(String[] args) {


        System.out.println("smallBalloon --");
        SmallHotAirBalloon smallBalloon = new SmallHotAirBalloon();
        smallBalloon.liftUp();
        smallBalloon.land();

        System.out.println("bigBalloon --");
        BigHotAirBalloon bigBalloon = new BigHotAirBalloon();
        bigBalloon.liftUp();
        bigBalloon.land();

        System.out.println("small --");
        HotAirBalloon small = smallBalloon;
        small.liftUp();
        small.land();

        System.out.println("big --");
        HotAirBalloon big = bigBalloon;
        big.liftUp();
        big.land();



    }
}

/*
Create a SmallHotAirBalloon, name it smallBalloon and
use its liftUp and land methods. Notice that the class had no code,
but it’s using the code from its parent class HotAirBalloon.

Create a BigHotAirBalloon, name it bigBalloon and
use its liftUp and land methods. Notice that the class had no code,
but it’s using the code from its parent class HotAirBalloon.

In a new line, assign the variables smallBalloon and
bigBalloon to HotAirBalloon variables called small and big respectively.
Just use the = symbol.

Use both methods from both small and big variables.
Notice that now we are using them as HotAirBalloons,
exactly the same as if it were an interface.
The difference is that the liftUp and land methods are implemented
in the abstract and the code is shared among the different classes
that extend from it.


 */