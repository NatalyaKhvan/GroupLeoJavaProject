package Natasha;

import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        String result = findUniqueChars(input);
        System.out.println("Result: " + result);
        scanner.close();

    }

    public static String findUniqueChars(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (str.indexOf(currentChar) == str.lastIndexOf(currentChar)) {
                result.append(currentChar);
            }
        }

        return result.toString();
    }

}
