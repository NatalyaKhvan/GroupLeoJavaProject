package natalya;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();

        System.out.println(identify(n));

        input.close();

    }

    public static String identify(int num) {
        String result = "";
        if (num % 2 == 0) {
            result = "Even";
        } else {
            result = "Odd";
        }

        return result;
    }
}

/*
1 - Numbers - Odd or even:
Write  a method which can identify given number is even or odd
Output ex:
identify(5); ->"Odd"
identify(6); ->"Even"
 */