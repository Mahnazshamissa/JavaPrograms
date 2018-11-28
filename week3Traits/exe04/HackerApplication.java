package week3Traits.exe04;

public class HackerApplication {

    public static void main(String[] args) {
        Messenger messenger=new Messenger();
        String text="I am thinking so I am exist. And I am 38 years old that is 19*2.";
        String encrypted=messenger.send(text);
        String decrypted=messenger.receive(encrypted);
        System.out.println("Original text:    "+text);
        System.out.println("Encrypted text:   "+encrypted);
        System.out.println("Decrypted text:   "+decrypted);
    }
}
