package exe04;

public class CharacterApplication {
    public static void main(String[] args) {
        CharacterExplorer characterExplorer = new CharacterExplorer();

        System.out.println("How many characters appear in the books in total? " + characterExplorer.getNumberOfCharacter() );

        System.out.println("How many characters died? " + characterExplorer.diedCharacter());

        System.out.println("Percentage of died womens in all books: " + characterExplorer.diedWomen()
                + " % and percentage of died mens in all books: " + characterExplorer.diedMen() +" %.");

        System.out.println("Which book has the biggest death count with how many? " + characterExplorer.getBiggestDeathBook());

        System.out.println("Who died in that book? " + characterExplorer.getCharacterInBiggestDeathBook());

        System.out.println("Which ones are the two allegiances that have the biggest dead count? " + characterExplorer.diedAllergiancesWith2BiggestDeadCount());

        System.out.println("Which percentage of deaths belong to nobility characters? " + characterExplorer.getNobilityCharactersPercentageDeaths() +" %.");

        System.out.println("In which book die the most amount of characters from the Stark allegiance? " + characterExplorer.getBookDeathAmountInStark());

        System.out.println("In which book die the most amount of characters from the Lannister allegiance? " + characterExplorer.getBookDeathAmountInLannister());

        System.out.println("How many Starks have died? " + characterExplorer.getStarksDeathsCount());

        System.out.println("How many Lannisters have died? " + characterExplorer.getLannisterDeadCount());

        System.out.println("Is there any character who didn’t die? " + characterExplorer.isAnyAliveCharacter());

        System.out.println("Has any character ever been killed in the same chapter that it got introduced? " + characterExplorer.hasAnyCharaterDiedInSameChapter());

    }
}
