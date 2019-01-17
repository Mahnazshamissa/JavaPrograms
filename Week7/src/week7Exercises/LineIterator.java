package week7Exercises;

import week7Exercises.Line;

import java.util.List;

public class LineIterator {

    private static final Integer LINE_SIZE = 5;

    private List<String> rows;
    private Integer position = 0;

    public LineIterator(List<String> rows) {
        this.rows = rows;
    }

    public boolean hasNext() {
        return position + LINE_SIZE <= rows.size();
    }

    public Line next() {
        String part1 = rows.get(position);
        String part2 = rows.get(position + 1);
        String part3 = rows.get(position + 2);
        String part4 = rows.get(position + 3);
        position += LINE_SIZE;
        return new Line(part1, part2, part3, part4);
    }
}
