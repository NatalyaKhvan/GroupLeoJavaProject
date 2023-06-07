package AMIN;

import java.util.Scanner;

public class ReverseNegativeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter negative number");

        int num = input.nextInt();
        int rev = 0;
        while (num < 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        System.out.println("Reverse num is: " + rev);

        input.close();
    }
}
