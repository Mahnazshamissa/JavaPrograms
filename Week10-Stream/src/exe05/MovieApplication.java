package exe05;

public class MovieApplication {

    public static void main(String[] args) {

        MovieSummarizer summarizer = new MovieSummarizer();

        System.out.println("How many distinct movie genres are there? " + summarizer.getNumberOfDistinctMovie());

        System.out.println("movie with the highest revenue " + summarizer.getMovieWithHighestRevenue());

        System.out.println("the two longest movies " + summarizer.getTwoLongestMovie());
    }
}
