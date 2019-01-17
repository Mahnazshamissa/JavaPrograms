package week7Exercises;

import java.util.Objects;

public class Line {

    private String part1;
    private String part2;
    private String part3;
    private String part4;

    public Line(String part1, String part2, String part3, String part4) {
        this.part1 = part1;
        this.part2 = part2;
        this.part3 = part3;
        this.part4 = part4;

    }


    public String getPart1() {
        return part1;
    }

    public String getPart2() {
        return part2;
    }

    public String getPart3() {
        return part3;
    }

    public String getPart4() {
        return part4;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return Objects.equals(part1, line.part1) &&
                Objects.equals(part2, line.part2) &&
                Objects.equals(part3, line.part3) &&
                Objects.equals(part4, line.part4);
    }

    @Override
    public int hashCode() {
        return Objects.hash(part1, part2, part3, part4);
    }
}
