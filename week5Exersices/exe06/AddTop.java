package week5Exersices.exe06;

public class AddTop implements Step {

    @Override
    public void perform(Furniture furniture) {
        furniture.add("top");
    }
}
