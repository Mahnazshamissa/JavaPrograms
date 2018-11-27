package week4Exercises.exe08;

import java.util.Optional;

public class AdvancedGiftApplication {

    public static void main(String[] args) {

        Optional<Box> giftBox = Optional.empty();
        System.out.println("Gift : " + giftBox);

        Box box = new Box("Robotoy");
        giftBox = Optional.of(box);
        System.out.println("Gift : " + giftBox.toString());


        if(giftBox.isPresent()){
            System.out.println("There is a present in the gift box" );
            System.out.println("The gift is a " + giftBox.get());
        }else {
            System.out.println("Oh no, where is my gift?");
        }
    }
}
/*
● Create an empty ​ giftBox ​ Optional of ​ Box ​ and display it.
● Create a ​ Box ​ with a present name as ​ content ​ .
● Assign an Optional of ​ Box ​ to the ​ giftBox ​ containing the previous ​ Box ​ and display it.
● Ask if the ​ giftBox ​ is present and display the answer.
● Get the value contained in ​ giftBox ​ and display it.
  To display the ​ Box ​ class create the ​ toString ​ method.
 */