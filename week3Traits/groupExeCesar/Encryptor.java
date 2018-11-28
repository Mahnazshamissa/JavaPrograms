package week3Traits.groupExeCesar;

import java.util.List;

public class Encryptor {

    public String encrypt(String text) {
        ListMaker listMaker=new ListMaker();
        List<Alphabet> reference=listMaker.makeReferenceList();
        listMaker.makeRotatedList(reference,5);
        return null;
    }
}
