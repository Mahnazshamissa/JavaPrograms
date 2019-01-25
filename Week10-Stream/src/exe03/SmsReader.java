package exe03;

import exe01.FileReader;
import exe02.Student;

import java.util.List;
import java.util.stream.Collectors;

public class SmsReader {
    private FileReader reader = new FileReader();

    public List<Sms> getSms(String filePath) {
        return reader.asStream("exe03/sms.csv")
                .skip(1)
                .map(e->e.split(";"))
                .map(e-> new Sms(e[0], e[1]))
                .collect(Collectors.toList());
    }
}
