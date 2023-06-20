package olena;

import java.util.LinkedHashSet;

/* String - Remove Duplicates
Write a return method that can remove the duplicated values from the String
  Ex: removeDup("AAABBBCCC") ==> ABC*/

public class RemoveDuplicates {
    public static String removeDup(String str) { // (removeDup) we use to input and returns a string with duplicated values remove
        // Create a LinkedHashSet to maintain order and remove duplicates
        LinkedHashSet<Character> uniqueChars = new LinkedHashSet<>();//(LinkedHashSet) use to store unique characters

        // Iterate over each character in the string
       // uniqueChars set using the (add) method,
        // because (LinkedHashSet) it not allow duplicate values, only unique characters can be added to the set.
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            uniqueChars.add(c); // Add the character to the set
        }

        // Build the resulting string without duplicates
        StringBuilder result = new StringBuilder();
        for (char c : uniqueChars) {
            result.append(c);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "AAABBBCCC";
        String result = removeDup(input);
        System.out.println(result);  // Output: ABC
    }
}
