package exe04stream;

import exe02.FileReader;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class HappinessApplication {
    public static void main(String[] args) {

        FileReader reader = new FileReader();


        reader.asStream("exe04stream/world-happiness-2017")
        .skip(1)
        .map(e -> e.split(";"))
        //.map(e -> Arrays.asList(e))
        .map(e -> new HappinessRecord(e[0], Integer.valueOf(e[1]), Double.valueOf(e[2])))
        .sorted(Comparator.comparing(HappinessRecord::getRank))
        .limit(5)
        .map(e -> e.toString())
        .forEach(e -> System.out.println(e));

        //.forEach(e-> System.out.println("Rank: "+ e.getRank + "| Country" + e.getCountry + "| Score" + e.getScore) );

    }
}

//instead of .get(pos.) we write [pos.] , that means column.