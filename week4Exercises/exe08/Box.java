package week4Exercises.exe08;

public class Box {

    private String content;

    public Box(String content) {
        this.content = content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "content=" + content;
    }
}
