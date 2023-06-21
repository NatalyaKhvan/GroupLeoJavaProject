package olena;

import java.util.LinkedHashSet;
/*Write a return  method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";*/

public class UniqueCharacters {
    public static String unique(String str) {
        // defines a public static method named unique that takes a String parameter str and returns a String
        LinkedHashSet<Character> uniqueChars = new LinkedHashSet<>();
//creates a LinkedHashSet named uniqueChars.
//The LinkedHashSet is used to store unique characters while preserving the order of insertion.

        // Iterate over each character in the string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            uniqueChars.add(c); // Add the character to the set
        }
/*(for loop iterates o)ver each character  input string, (uniqueChars.add(c) )line adds the character to the uniqueChars set.
because (LinkedHashSet) does not allow duplicate values, only unique characters can be added.*/
        // Build the resulting string with unique characters
        StringBuilder result = new StringBuilder(); // code initializes a StringBuilder named result to build resulting string with unique characters
        for (char c : uniqueChars) {
            result.append(c);
        }

        return result.toString();//converts the result StringBuilder to String and will returns as result of the unique method.
    }

    public static void main(String[] args) {
        String input = "AAABBBCCCDEF";
        String result = unique(input);
        System.out.println(result);  // Output: DEF
    }
}
