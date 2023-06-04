package natalya;

import java.util.Scanner;

public class ReverseNegativeNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a negative number:");
        int n = input.nextInt();

        while (n >= 0) {
            System.out.println(n + " is not a negative number. Enter a negative number:");
            n = input.nextInt();
        }

        System.out.println(reverseDigits(n));
        input.close();

    }


    public static int reverseDigits(int num) {

        /*
    **Numbers -- Reverse Negative Number**
    Write a return method that can reverse digits of a negative number and return it as int
    input: -35  output: -53
     */

        String reverse = "-";
        num = Math.abs(num);

        String number = String.valueOf(Integer.valueOf(num));

        for (int i = number.length() - 1; i >= 0; i--) {
            reverse += number.charAt(i);
        }

        num = Integer.parseInt(reverse);
        return num;
    }
}
