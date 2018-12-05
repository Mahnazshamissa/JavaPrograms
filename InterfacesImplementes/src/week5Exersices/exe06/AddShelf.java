package week5Exersices.exe06;

public class AddShelf implements Step {

    @Override
    public void perform(Furniture furniture) {
        furniture.add("shelf");
    }
}
