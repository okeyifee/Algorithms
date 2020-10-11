import java.util.*;

class Challenge {
    public static long triangular( Integer n ) {
        System.out.println(n);

        if (n < 1 || n > 10_000){
            return 0;
        }
        int i;
        int j = 1;
        int k = 1;

        for (i = 1; i < n; i++) {

            j = j + 1;
            k = k + j;
        }
        return k;
    }

}