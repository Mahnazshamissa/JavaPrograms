package week5Exersices.exe06;

public class AddDoor implements Step {

    @Override
    public void perform(Furniture furniture) {
        furniture.add("door");
    }
}
