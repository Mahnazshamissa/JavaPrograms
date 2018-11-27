package week4Exercises.exe04;

import java.util.Optional;

public class BasicGiftApplication {

    public static void main(String[] args) {

        Optional<String> giftBox = Optional.empty();
        System.out.println("Gift : " + giftBox);


        giftBox = Optional.of("Robotoy");
        System.out.println("Gift : " + giftBox);


        if(giftBox.isPresent()){
            System.out.println("There is a present in the gift box" );
            System.out.println("The gift is a " + giftBox.get());
        }else {
            System.out.println("Oh no, where is my gift?");
        }


    }
}

/*
Create an empty giftBox Optional of String and display it.
Assign an Optional of String to the giftBox containing
an actual present and display it.
Ask if the giftBox is present and display the answer.
Get the value contained in giftBox and display it.

 */