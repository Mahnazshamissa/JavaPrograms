package exe01;


import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Pokemon {

    List<String> pokemonList = readPokemonAsStreamToList();
    Set<String> pokemonSet = readPokemonAsStreamToSet();

    List<String> type1List = pokemonList.stream()
            .map(e -> e.split(";"))
            .map(e -> e[2])
            //.distinct()
            .collect(Collectors.toList());

    Set<String> type2Set = pokemonSet.stream()
            .map(e -> e.split(";"))
            .map(e -> e[3])
            .distinct()
            .limit(7)
            .collect(Collectors.toSet());

    Map<String, Long> numberOfPokemon = type1List.stream()
            .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

   /* Map<String, List<String>> toList = type1List.stream()
            .collect(Collectors.groupingBy(e -> e, Collectors.toList()));*/













    private static List<String> readPokemonAsStreamToList() {
        FileReader reader = new FileReader();
        return reader.asStream("exe01/pokemon.csv")
                .skip(1)
                .collect(Collectors.toList());
    }

    private static Set<String> readPokemonAsStreamToSet() {
        FileReader reader = new FileReader();
        return reader.asStream("exe01/pokemon.csv")
                .skip(1)
                .collect(Collectors.toSet());
    }


}
