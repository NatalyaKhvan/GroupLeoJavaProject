package olena;
/*PrimeNumber**
Write a method that can check if a number is prime or not
*/


public class Prime_Checker {

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            //Initializes a for loop with a variable i starting from 2 and continuing until the square root of the number.
            if (number % i == 0) {
                //Checks if the number is divisible
                return false;
            }
        }

        return true;


    }

    public static void main(String[] args) {//Defines the main method
        int number = 37;
        if (isPrime(number)) { //we call method isPrime , passing the number as an argument, and checks the returned value using  (if) statement.
            System.out.println(number + " is prime.");
        } else {
            System.out.println(number + " is not prime.");
        }
    }
}
