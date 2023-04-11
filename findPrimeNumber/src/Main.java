public class Main {
    public static void main(String[] args) {

        /* In the set of positive integers there are many numbers that have no divisors other than
        itself and 1 in this way. Numbers with this property are called "prime numbers".
        For example 2, 3, 5, 7, 11, 13, 17, 19, 23, 29...

        **Here, in order to find the prime number, it will be trying to find the 'remainder'
        by dividing all the numbers from 2 to the number. */

        int number = 41;                     // number to be entered into the system
        int remainder = number % 2;          // the remainder of dividing the number entered into the system by 2

        boolean numberIsPrime = true;

        if (number == 1) {
            System.out.println("Number Is Not Prime");
            return;
         }

        if (number < 1) {
            System.out.println("Please Enter a Positive Integer Greater Than 1");
            return;
         }

        for (int i=2; i<number; i++) {
            if (number % i == 0) {
                numberIsPrime = false;
            }
        }

        if (numberIsPrime) {
            System.out.println("Number Is Prime");
            }else{
                System.out.println("Number Is Not Prime");
            }
        }
}