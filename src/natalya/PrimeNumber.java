package natalya;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number:");
        int n = input.nextInt();
        System.out.println("isPrimeNumber(n) = " + isPrimeNumber(n));
        System.out.println("isPrimeWithoutDivisionOperator(n) = " + isPrimeWithoutDivisionOperator(n));

        input.close();
    }


    /*
    **Numbers -- PrimeNumber**
    Write a method that can check if a number is prime or not
     */
    public static boolean isPrimeNumber(int n) {


        for (int i = 2; i < n; i++) {
            if (n % 2 == 0) {
                return false;
            }
        }
        return true;
    }


    /*
    Write a method that can check if a number is prime or not without division operator
    */
    public static boolean isPrimeWithoutDivisionOperator(int n1) {

        int remainder = n1;

        for (int i = 2; i < n1; i++) {
            while (remainder >= i) {
                remainder = remainder - i;
            }
            if (remainder == 0) {
                return false;
            }
        }

        return true;
    }

}

