package kenan;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("enter a number");
        int n = input.nextInt();
        System.out.println(isPrime(n));




    }
    public static boolean isPrime(int number){

        for (int i = 2; i <number ; i++) {
            if (number%2 == 0){
                return false;
            }
        }
        return true;
    }
}
