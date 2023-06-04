package Natasha;

import java.util.Scanner;

public class PrimeNumber {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

//Test
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        System.out.println(n + " is " + (isPrime(n) ? "prime" : "not prime"));
        input.close();

    }
}