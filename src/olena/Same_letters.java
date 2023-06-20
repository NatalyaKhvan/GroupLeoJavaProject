package olena;

import java.util.HashMap;
import java.util.Map;

/*String - Same letters
Write a return method that checks if a string is built out of the same letters as another string.
  Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false*/
public class Same_letters {
    public static boolean same(String str1, String str2) {//method takes two strings, as input and returns a boolean value
        if (str1.length() != str2.length()) {
            return false;//first checks if the lengths of the two strings are equal. If they are not equal, returns false
        }

        Map<Character, Integer> charFrequency1 = getCharFrequency(str1);
        Map<Character, Integer> charFrequency2 = getCharFrequency(str2);

        return charFrequency1.equals(charFrequency2);
    }

    private static Map<Character, Integer> getCharFrequency(String str) {
        Map<Character, Integer> charFrequency = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
            //getCharFrequency method is a helper method what takes a string
            // when we  input and returns a HashMap containing the frequency of each character in the string.
        }

        return charFrequency;// Finally, the method returns the result of comparing the two maps using the equals method, which checks if the maps have the same key-value pairs.
    }

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "cab";
        System.out.println(same(str1, str2));  // Output: true

        str1 = "abc";
        str2 = "abb";
        System.out.println(same(str1, str2));  // Output: false
    }
}
