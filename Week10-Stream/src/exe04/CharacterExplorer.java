package exe04;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CharacterExplorer {

    private CharacterReader characterReader = new CharacterReader();
    private List<Character> characters = characterReader.getCharacter();

    public Long getNumberOfCharacter() {
        return characters.stream()
                .count();
    }

    public Long diedCharacter() {
        return characters.stream()
                .filter(e -> !e.getBookOfDeath().isEmpty())
                .count();
    }

    public Long diedMen() {
        return characters.stream()
                .filter(e -> e.getGender().equals("1"))
                .filter(e -> !e.getBookOfDeath().isEmpty())
                .count() * 100 / characters.stream()
                .count();
    }

    public Long diedWomen() {
        return characters.stream()
                .filter(e -> e.getGender().equals("0"))
                .filter(e -> !e.getBookOfDeath().isEmpty())
                .count() * 100 / characters.stream()
                .count();
    }

    public String getBiggestDeathBook() {
        return characters.stream()
                .collect(Collectors.groupingBy(Character::getBookOfDeath, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> !e.getKey().isEmpty())
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> "Book: " + e.getKey() + " | " + e.getValue() + " dead character." + "\nDead Characters: ")
                .limit(1)
                .collect(Collectors.joining());
    }

    public List<String> getCharacterInBiggestDeathBook() {
        return characters.stream()
                .collect(Collectors.groupingBy(Character::getName, Collectors.counting()))
                .entrySet().stream()
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }


    public List<String> diedAllergiancesWith2BiggestDeadCount() {
        return characters.stream()
                .filter(e -> !e.getBookOfDeath().isEmpty())
                //.sorted((e1, e2) -> e2.getBookOfDeath().compareTo(e1.getBookOfDeath()))
                .sorted(Comparator.comparing(Character::getBookOfDeath).reversed())
                .limit(2)
                .map(e -> e.getAllegiances())
                .collect(Collectors.toList());
    }

    public Long getNobilityCharactersPercentageDeaths() {
        return characters.stream()
                .filter(e -> !e.getBookOfDeath().isEmpty())
                .filter(e -> e.getNobility().toString().equals("1"))
                .count() * 100 / characters.stream()
                .filter(e -> !e.getBookOfDeath().isEmpty())
                .map(Character::getBookOfDeath)
                .count();
    }

    public String getBookDeathAmountInStark() {
        return characters.stream()
                .filter(e -> !e.getBookOfDeath().isEmpty())
                .filter(e -> e.getAllegiances().equalsIgnoreCase("Stark"))
                .collect(Collectors.groupingBy(Character::getBookOfDeath, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> !e.getKey().isEmpty())
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> "Book: " + e.getKey() + " | " + "Dead Characters: " + e.getValue())
                .collect(Collectors.joining());
    }

    public String getBookDeathAmountInLannister() {
        return characters.stream()
                .filter(e -> !e.getBookOfDeath().isEmpty())
                .filter(e -> e.getAllegiances().equalsIgnoreCase("Lannister"))
                .collect(Collectors.groupingBy(Character::getBookOfDeath, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> !e.getKey().isEmpty())
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> "Book: " + e.getKey() + " | " + "Dead Characters: " + e.getValue())
                .collect(Collectors.joining());
    }

    public Long getStarksDeathsCount() {
        return characters.stream()
                .filter(e -> !e.getBookOfDeath().isEmpty())
                .filter(e -> e.getAllegiances().equalsIgnoreCase("Stark"))
                .count();
    }

    public Long getLannisterDeadCount() {
        return characters.stream()
                .filter(e -> !e.getBookOfDeath().isEmpty())
                .filter(e -> e.getAllegiances().equalsIgnoreCase("Lannister"))
                .count();
    }

    public boolean isAnyAliveCharacter() {
        return characters.stream()
                .anyMatch(e -> e.getBookOfDeath().isEmpty());

    }


    public boolean hasAnyCharaterDiedInSameChapter() {
        return characters.stream()
                .filter(e -> !e.getBookOfDeath().isEmpty())
                .anyMatch(e -> e.getDeathChapter().equals(e.getBookOfDeath()));

    }


}
