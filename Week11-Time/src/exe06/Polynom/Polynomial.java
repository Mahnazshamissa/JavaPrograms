package exe06.Polynom;

import java.util.Arrays;
import java.util.List;

public class Polynomial {


    static int horner(List<Integer> coeffitionts, int n, int x) {
        int result = coeffitionts.get(0);

        for (int position =1; position <n; position++)
            result += coeffitionts.get(position)*(Double.valueOf(Math.pow(x,position)).intValue());

        return result;
    }

    public static void main (String[] args)
    {
        // Let us evaluate value of 2x3 - 6x2 + 2x - 1 for x = 3
        List<Integer> coefs = Arrays.asList(-1, 2, -6, 2);
        int x = 3;
        int n = coefs.size();
        System.out.println("Value of polynomial is " + horner(coefs,n,x));
    }
}
