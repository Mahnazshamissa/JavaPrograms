package exe04;

import exe02.FileReader;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HappinessApplication {
    public static void main(String[] args) {

        HappinessRecordReader recordReader = new HappinessRecordReader();
        List<HappinessRecord> records = recordReader.asList();

        records.stream()
        .skip(1)
        .sorted(Comparator.comparing(e -> e.getRank()))
        .limit(5)
        .forEach(e-> System.out.println(e));
        //.forEach(e-> System.out.println("Rank: "+ e.getRank + "| Country" + e.getCountry + "| Score" + e.getScore) );

    }
}
