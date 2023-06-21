package Natasha;

import java.util.Arrays;
import java.util.Scanner;

public class StringSameLetters {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the first word: ");
            String str1 = scanner.nextLine();

            System.out.print("Enter the second word: ");
            String str2 = scanner.nextLine();

            boolean result = same(str1, str2);
            System.out.println("Are the words contain of the same letters? " + result);
            scanner.close();
        }

    public static boolean same(String str1, String str2) {
        // Convert strings to lowercase to ignore case sensitivity
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Check if the lengths of the strings are equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Check if each character in str1 exists in str2 and vice versa
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if (!str2.contains(String.valueOf(c))) {
                return false;
            }
        }

        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);
            if (!str1.contains(String.valueOf(c))) {
                return false;
            }
        }

        return true;
    }
}
