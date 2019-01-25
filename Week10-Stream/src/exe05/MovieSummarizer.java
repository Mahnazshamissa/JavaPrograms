package exe05;

import java.util.List;
import java.util.stream.Collectors;

public class MovieSummarizer {

    private MovieReader movieReader = new MovieReader();
    private List<Movie> movieList = movieReader.getMovie();
    //private Set<Movie> movieSet = movieReader.getMovie();


    public Long getNumberOfDistinctMovie(){
        return movieList.stream()
                .count();
    }

    public String getMovieWithHighestRevenue(){
        return movieList.stream()
                .collect(Collectors.groupingBy(Movie::getRevenue, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getKey() + " | " + e.getValue())
                .limit(1)
                .collect(Collectors.joining());
    }

    public String getTwoLongestMovie() {
        return movieList.stream()
                .collect(Collectors.groupingBy(Movie::getRuntime, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getKey() + " | " + e.getValue())
                .limit(2)
                .collect(Collectors.joining());
    }
}
