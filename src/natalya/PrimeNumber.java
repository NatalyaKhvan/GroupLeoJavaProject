package natalya;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

    /*
    **Numbers -- PrimeNumber**
    Write a method that can check if a number is prime or not
     */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number:");
        int n = input.nextInt();
        System.out.println(isPrimeNumber(n));

        input.close();

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
