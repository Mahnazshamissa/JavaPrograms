package exe01.withPokemonReader;

import exe01.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class PokemonReader {
    private FileReader fileReader = new FileReader();

    public List<Pokemon> readPokemons() {
        return fileReader.asStream("exe01/pokemon.csv")
                .skip(1)
                .map(e -> e.split(";"))
                .map(e -> new Pokemon(e[1], e[2], e[3],
                        Integer.valueOf(e[4]), Integer.valueOf(e[5]), Integer.valueOf(e[6])
                        , Integer.valueOf(e[7]), Integer.valueOf(e[8]), Integer.valueOf(e[9])
                        , Integer.valueOf(e[10]), Integer.valueOf(e[11]), Boolean.valueOf(e[12])))
                .collect(Collectors.toList());

    }
}
