package week5Exersices.exe06;

public class IkeaApplication {

    public static void main(String[] args) {

        WardrobeBuilder wardrobeBuilder = new WardrobeBuilder();
        Wardrobe wardrobe= wardrobeBuilder.build();
        System.out.println(wardrobe);



    }
}

/*
Create a WardrobeBuilder and build one Wardrobe.
Display the wardrobe. It should have all the right parts.

 */