package exe05;

import exe02.FileReader;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class FilmReader {

    private FileReader reader = new FileReader();

    public List<Film> getFilms(String filePath) {
        return reader.asStream("exe05/films")
                .skip(1)
                .map(e->e.split(";"))
                .map(e-> new Film(e[8], Double.valueOf(e[9]), Integer.valueOf(e[10]),
                        Integer.valueOf(e[6]), Integer.valueOf(e[0]),Long.valueOf(e[5])))
                .collect(Collectors.toList());
    }




   /* private Film toFilmsRecord(String line) {
        String[] split = line.split(";");
        List<String> columns = Arrays.asList(split);
        String title = columns.get(8);
        String score = columns.get(9);
        String voteCount = columns.get(10);
        String runtime = columns.get(6);
        String budget = columns.get(0);
        String revenue = columns.get(5);
        return new Film(title, Double.valueOf(score), Integer.valueOf(voteCount),
                Integer.valueOf(runtime), Integer.valueOf(budget),revenue);
    }*/
}

/*
String dateInString = "27/02/2016"
SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
Date date = formatter.parse(dateInString);
 */