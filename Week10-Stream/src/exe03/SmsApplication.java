package exe03;

public class SmsApplication {

    public static void main(String[] args) {
        SmsExplorer smsExplorer = new SmsExplorer();


        System.out.println("Ham/spam ratio: " + smsExplorer.getRatio() );

        System.out.println("Most used ham word: " + smsExplorer.getMostUsedHamWord());

        System.out.println("Most used ham letter: " + smsExplorer.getMostUsedHamLetter());

        System.out.println("Longest spam message: " + smsExplorer.getLongestSpam().get());
    }

}
