package natalya;

import java.util.Scanner;

public class DivideWithoutOperator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter dividend:");
        double dividend = input.nextDouble();

        System.out.println("Enter divisor:");
        double divisor = input.nextDouble();

        System.out.println(divide(dividend, divisor));

        input.close();

    }


    public static String divide(double num1, double num2) {

        String result = num1 + " divide " + num2 + " = ";
        int count = 0;
        double remainder = num1;

        if (num2 == 0) {
            throw new ArithmeticException("Divisor can not be 0");
        }

        while (remainder >= num2) {
            remainder -= num2;
            count++;
        }

        result += count + " remainder " + remainder;
        return result;
    }

}

/*
2 - Numbers - Divide without / operator:
Write a method that can divide two numbers without using division operator
 */
