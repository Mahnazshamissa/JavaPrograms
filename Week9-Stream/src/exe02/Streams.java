package exe02;

import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    private FileReader reader = new FileReader();
    private List<String> names = getNames();

    public List<String> getNames(){
        return reader.asStream("exe02/names")
                .collect(Collectors.toList());
    }

    public List<String> getNamesLessThan4(){
        return getNames().stream()
                .filter(e->e.length()<4)
                .collect(Collectors.toList());
    }

    public List<String> getNamesEndsWithM(){
        return getNames().stream()
                .filter(e->e.endsWith("m"))
                .map(e->e.toUpperCase())
                .collect(Collectors.toList());
    }

    public List<String> getNamesContainsER(){
        return getNames().stream()
                .filter(e->e.contains("e"))
                .filter(e->e.contains("r"))
                .collect(Collectors.toList());
    }

    public List<String> getNames4ContainsAM(){
        return getNames().stream()
                .filter(e->e.length()==4)
                .map(e->e.toLowerCase())
                .filter(e->e.contains("a"))
                .filter(e->e.contains("m"))
                .map(e->e.replaceAll("a","aa"))
                .collect(Collectors.toList());
    }






}
