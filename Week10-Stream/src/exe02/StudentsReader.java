package exe02;

import exe01.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class StudentsReader {

    private FileReader reader = new FileReader();

    public List<Student> getStudents(String filePath) {
        return reader.asStream("exe02/students-performance.csv")
                .skip(1)
                .map(e->e.split(";"))
                .map(e-> new Student(e[0], e[1], Integer.valueOf(e[2]),
                        Integer.valueOf(e[3]), Integer.valueOf(e[4])))
                .collect(Collectors.toList());
    }
}
