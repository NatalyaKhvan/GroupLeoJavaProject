package fara;

public class PrimeNumber {
    /*
    **Numbers -- PrimeNumber**
Write a method that can check if a number is prime or not
     */
    public static void main(String[] args) {

        if (isPrime(9))
            System.out.println("It is a prime number");
        else
            System.out.println("It is not a prime number");
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
