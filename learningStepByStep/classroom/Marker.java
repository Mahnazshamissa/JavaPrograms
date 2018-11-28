package learningStepByStep.classroom;

public class Marker {

    private String color;

    public Marker(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void paint(){
        System.out.println("Marker paints in "+ color);

    }
}
