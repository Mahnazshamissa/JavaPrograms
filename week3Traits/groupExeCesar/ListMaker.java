package week3Traits.groupExeCesar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListMaker {

    List<Alphabet> makeReferenceList(){
        Alphabet a=new Alphabet(1);
        Alphabet b=new Alphabet(2);
        Alphabet c=new Alphabet(3);
        Alphabet d=new Alphabet(4);
        Alphabet e=new Alphabet(5);
        Alphabet f=new Alphabet(6);
        Alphabet g=new Alphabet(7);
        Alphabet h=new Alphabet(8);
        Alphabet i=new Alphabet(9);
        Alphabet j=new Alphabet(10);
        Alphabet k=new Alphabet(11);
        Alphabet l=new Alphabet(12);
        Alphabet m=new Alphabet(13);
        Alphabet n=new Alphabet(14);
        Alphabet o=new Alphabet(15);
        Alphabet p=new Alphabet(16);
        Alphabet q=new Alphabet(17);
        Alphabet r=new Alphabet(18);
        Alphabet s=new Alphabet(19);
        Alphabet t=new Alphabet(20);
        Alphabet u=new Alphabet(21);
        Alphabet v=new Alphabet(22);
        Alphabet w=new Alphabet(23);
        Alphabet x=new Alphabet(24);
        Alphabet y=new Alphabet(25);
        Alphabet z=new Alphabet(26);
        List<Alphabet> reference=new ArrayList<>();
        reference.add(a);
        reference.add(b);
        reference.add(c);
        reference.add(d);
        reference.add(e);
        reference.add(f);
        reference.add(g);
        reference.add(h);
        reference.add(i);
        reference.add(j);
        reference.add(k);
        reference.add(l);
        reference.add(m);
        reference.add(n);
        reference.add(o);
        reference.add(p);
        reference.add(q);
        reference.add(r);
        reference.add(s);
        reference.add(t);
        reference.add(u);
        reference.add(v);
        reference.add(w);
        reference.add(x);
        reference.add(y);
        reference.add(z);
        return reference;
    }
    public List<Alphabet> makeRotatedList(List<Alphabet> reference, Integer key) {
        List<Alphabet> rotated=reference;
        Collections.rotate(rotated,key);
        return rotated;
    }
}
