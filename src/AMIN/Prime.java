package AMIN;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {


        System.out.println(isPrime(6));
    }
        public static boolean isPrime(int n) {



            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }