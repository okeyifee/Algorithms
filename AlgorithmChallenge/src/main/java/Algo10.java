import java.util.*;

class Challenge {
    public static long triangular( Integer n ) {
//  prints given number
        System.out.println(n);

//  checks if given number is within range
        if (n < 1 || n > 10_000){
            return 0;
        }
        int i;
        int j = 1;
        int k = 1;

// loop to get the count
        for (i = 1; i < n; i++) {

            j = j + 1;
            k = k + j;
        }
        return k;
    }
}