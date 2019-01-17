package exe05;

import java.util.Date;

public class Film {

    private String title;
    private Double score;
    private Integer voteCount;
    private Integer runtime;
    private Integer budget;
    private Long revenue;
    //private Date revenue;

    public Film(String title, Double score, Integer voteCount, Integer runtime, Integer budget, Long revenue) {
        this.title = title;
        this.score = score;
        this.voteCount = voteCount;
        this.runtime = runtime;
        this.budget = budget;
        this.revenue = revenue;
    }

    public String getTitle() {
        return title;
    }

    public Double getScore() {
        return score;
    }

    public Integer getVoteCount() {
        return voteCount;
    }

    public Integer getRuntime() {
        return runtime;
    }

    public Integer getBudget() {
        return budget;
    }

    public Long getRevenue() {
        return revenue;
    }

    @Override
    public String toString() {
        return "\""+ title + "\"" ;
    }
}
