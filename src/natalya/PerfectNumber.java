package natalya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        input.close();

        System.out.println("isPerfectNumber(number) = " + isPerfectNumber(number));
        System.out.println("isPerfectNumberWithoutDivisionOperator(number) = " + isPerfectNumberWithoutDivisionOperator(number));

    }

    public static boolean isPerfectNumber(int number) {

        int sum = 1;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        if (sum == number) {
            return true;
        }
        return false;
    }

    public static boolean isPerfectNumberWithoutDivisionOperator(int number) {

        int sum = 1;
        int remainder = number;

        for (int i = 2; i < number; i++) {  // 1, 2

            while (remainder > i) {
                remainder = remainder - i;
                if (remainder == i) {
                    sum += i;
                }
            }
            remainder = number;
        }

        if (sum == number) {
            return true;
        }
        return false;
    }
}


