package natalya;

public class PrimeNumber {

    public static void main(String[] args) {

    /*
    **Numbers -- PrimeNumber**
    Write a method that can check if a number is prime or not
     */

        System.out.println(isPrimeNumber(4));

    }


    public static boolean isPrimeNumber(int n) {

        for (int i = 2; i < n; i++) {
            if (n % 2 == 0) {
                return false;
            }
        }
        return true;
    }
}
