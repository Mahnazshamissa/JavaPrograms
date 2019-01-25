package exe01.withPokemonReader;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PokemonApplication {
    public static void main(String[] args) {
        PokemonExplorer pokemonexplorer = new PokemonExplorer();

        System.out.println("---------list of Pokemons:-------");
        System.out.println(pokemonexplorer.allPokemones()+"\n");

        System.out.println("1-how many pokemons are exist in this file?");
        System.out.println(pokemonexplorer.amountOfPokemons() + " Pokemons are in this List\n");

        System.out.println("2-How many Pokemons don't have a Type2?");
        System.out.println(pokemonexplorer.numberOfNoTypeII() + " don't have typeII\n");

        System.out.println("3-Pokemons with Maximum Speed: ");
        System.out.println(pokemonexplorer.fastestPokemons());
        System.out.println(pokemonexplorer.fastestPokemons().size()+" pokemons have the maximum speed.\n");

        System.out.println("4-display the list of TypeI");
        Map<String, List<Pokemon>> typeI = pokemonexplorer.pokemonsBelongToTypeI();
        System.out.println(typeI.keySet()+ "\n");

        System.out.println("5-Pokemons belong to TypeI:");
        System.out.println(typeI + "\n");

        System.out.println("6-display the list of TypeII");
        Map<String, List<Pokemon>> typeII = pokemonexplorer.pokemonsBelongToTypeII();
        List<String> typesII = typeII.keySet().stream().sorted().collect(Collectors.toList());
        System.out.println("TypeII "+typesII + "\n");

        System.out.println("7-Pokemons related to typeII:");
        System.out.println(typeII);

        System.out.println("8-Set of typeII:");



    }
}
