package natasha;

import java.util.Scanner;

public class FrequenceOfCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.next().toLowerCase();
        System.out.print("Enter the character to search for: ");
        char searchChar = 0;

        boolean isValid = false;
        do {
            String searchCharString = scanner.next();
            if (searchCharString.length() == 1 && Character.isLetter(searchCharString.charAt(0))) {
                searchChar = Character.toLowerCase(searchCharString.charAt(0));
                isValid = true;
            } else {
                System.out.println("Invalid input! Please enter a single alphabetic character.");
            }
        } while (!isValid);


        scanner.close();

        int frequency = calculateCharacterFrequency(word, searchChar);

        System.out.println("Character frequency:");
        System.out.println(searchChar + ": " + frequency);
    }

    public static int calculateCharacterFrequency(String word, char searchChar) {
        int frequency = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c == searchChar) {
                frequency++;
            }
        }
        return frequency;
    }
}


