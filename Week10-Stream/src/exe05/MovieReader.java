package exe05;

import exe01.FileReader;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MovieReader {
    private FileReader reader = new FileReader();

    public List<Movie> getMovie() {
        return reader.asStream("exe05/movies.csv")
                .skip(1)
                .map(e->e.split(";"))
                .map(e-> new Movie(e[1], Long.valueOf(e[5]), Integer.valueOf(e[6])))
                .collect(Collectors.toList());
    }
}
