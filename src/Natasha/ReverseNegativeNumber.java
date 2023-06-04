package Natasha;
import java.util.Scanner;

public class ReverseNegativeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int reversedNumber = 0;

        while (reversedNumber == 0) {
            System.out.print("Enter a negative number: ");
            try {
                int n = scanner.nextInt();
                reversedNumber = reverseNegative(n);

                if (reversedNumber == 0 || reversedNumber >= 0) {
                    System.out.println("Invalid input. Please enter a negative number.");
                    reversedNumber = 0;
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid negative number.");
                scanner.nextLine(); // Clear the input buffer
            }
        }

        System.out.println("Reversed number: " + reversedNumber);
    }

    public static int reverseNegative(int n) {
        if (n >= 0) {
            return n;
        }

        String numberString = Integer.toString(n);
        String reversedNumberString = new StringBuilder(numberString.substring(1)).reverse().toString();
        String reversedString = "-" + reversedNumberString;

        try {
            return Integer.parseInt(reversedString);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input. Cannot reverse the digits of the number.");
        }
    }
}
