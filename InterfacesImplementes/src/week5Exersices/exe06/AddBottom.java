package week5Exersices.exe06;

public class AddBottom implements Step {

    @Override
    public void perform(Furniture furniture) {
        furniture.add("bottom");
    }
}
