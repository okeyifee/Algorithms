/*
Checks if a give number is even or odd
 */

public class EvenOrOdd {

    public static String even_or_odd(int number) {

        /*
        checks if the modulus of the division between the number and 2 equals zero....
        if yes, returns even, else return odd

         */


        if (number % 2 == 0){
            return "Even";
        }
        return "odd";
    }
}