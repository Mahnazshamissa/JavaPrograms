package exe03;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SmsExplorer {
    private SmsReader smsReader = new SmsReader();
    private List<Sms> smsList = smsReader.getSms("exe03/sms.csv");

    public String getRatio() {
        return smsList.stream()
                .collect(Collectors.groupingBy(Sms::getType, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getKey() + " " + e.getValue() * 100 / getTotalNumberOfSms() + "% ")
                .collect(Collectors.joining());
    }

    private Long getTotalNumberOfSms() {
        return smsList.stream()
                .count();
    }

    public String getMostUsedHamWord() {
        return smsList.stream()
                .filter(e-> e.getType().equals("ham"))
                .map(e-> e.getMessage().split(" "))
                .flatMap(e -> Stream.of(e))
                .collect(Collectors.groupingBy(e->e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()) )
                .limit(1)
                .map(e -> e.getKey() + " appears " + e.getValue() + " times ")
                .collect(Collectors.joining());

    }

    public String getMostUsedHamLetter() {
        return smsList.stream()
                .filter(e-> e.getType().equals("ham"))
                .map(e-> e.getMessage().replaceAll(" ",""))
                //.map(e-> e.split(""))
                //.flatMap(e -> Stream.of(e))
                .flatMap(e -> Stream.of(e.split("")))
                .collect(Collectors.groupingBy(e->e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()) )
                .limit(1)
                .map(e -> e.getKey() + " appears " + e.getValue() + " times ")
                .collect(Collectors.joining());

    }


    public Optional<Integer> getLongestSpam() {
        return smsList.stream()
                .filter(e -> e.getType().equals("spam"))
                .mapToInt(e -> e.getMessage().length())
                .boxed()
                .sorted(Comparator.reverseOrder())
                .findFirst();
        //.sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
        //.findFirst();
        //.limit(1)
        //.count();
    }


}
