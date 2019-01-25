package exe04;

import exe01.FileReader;
import exe04.Character;

import java.util.List;
import java.util.stream.Collectors;

public class CharacterReader {

    private FileReader reader = new FileReader();

    public List<Character> getCharacter() {
        return reader.asStream("exe04/got-characters.csv")
                .skip(1)
                .map(e->e.split(";"))
                .map(e-> new Character(e[0], e[1], e[2], e[3], e[4],
                        Integer.valueOf(e[5]), Integer.valueOf(e[6]),
                        Integer.valueOf(e[7]), Integer.valueOf(e[8]),
                        Integer.valueOf(e[9]), Integer.valueOf(e[10]),
                        Integer.valueOf(e[11]),Integer.valueOf(e[12])))
                .collect(Collectors.toList());
    }
}
