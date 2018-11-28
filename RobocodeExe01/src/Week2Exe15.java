import java.util.ArrayList;
import java.util.List;

public class Week2Exe15 {
    public static void main(String[] args) {
        List<String> clothes = new ArrayList<String>();
        clothes.add("blouse");
        clothes.add("sneakers");
        clothes.add("tie");
        clothes.add("sandals");
        clothes.add("jeans");
        clothes.add("short pants");
        clothes.add("tank");
        clothes.add("blazer");
        System.out.println(clothes);

        String tank = clothes.get(6);
        String shortPants = clothes.get(5);
        String sneakers = clothes.get(1);

        System.out.println("Hansel will wear a " + tank + ", " + shortPants + " and " + sneakers);



    }


}


/*

Collection of String clothes ​ = [“blouse”, “sneakers”, “tie”, “sandals”, “jeans”,
“short pants”, “tank”, “blazer”]

String tank ​ = ​ clothes.​ get​ (6)
String shortPants ​ = ​ clothes.​ get​ (5)
String sneakers ​ = ​ clothes.​ get​ (1)

say​ (“Hansel will wear a ” ​ + ​ tank ​ + ​ “, ” ​ + ​ shortPants ​ + ​ “ and ” ​ + ​ sneakers)

 */