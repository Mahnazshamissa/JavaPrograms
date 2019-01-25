package exe05;

public class Movie {

    private String genres;
    private Long revenue;
    private Integer runtime;


    public Movie(String genres, Long revenue, Integer runtime) {
        this.genres = genres;
        this.revenue = revenue;
        this.runtime = runtime;
    }

    public String getGenres() {
        return genres;
    }

    public Long getRevenue() {
        return revenue;
    }

    public Integer getRuntime() {
        return runtime;
    }
}
