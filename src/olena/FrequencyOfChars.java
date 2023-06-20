package olena;

import java.util.HashMap;
import java.util.Map;

/*String - Frequency of Characters
Write a return method that can find the frequency of characters
  Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/
public class FrequencyOfChars {
    public static String getFrequencyOfChars(String str) {
        Map<Character, Integer> charFrequency = new HashMap<>();//uses a HashMap to store the frequency of each character

        // Count the frequency of each character
        for (int i = 0; i < str.length(); i++) { //for loop iterates over the characters in the string,
                                                // updating the frequency count in the charFrequency map
            char c = str.charAt(i);
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);//getOrDefault returns the default value of 0,
                                                                                 // and then add 1 .
        }

        // Build the frequency string
        StringBuilder frequencyString = new StringBuilder();//StringBuilder is  converted to a string and returned.
        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            frequencyString.append(entry.getKey());
            frequencyString.append(entry.getValue());
        }

        return frequencyString.toString();
    }

    public static void main(String[] args) {
        String input = "AAABBCDD";
        String frequency = getFrequencyOfChars(input);
        System.out.println(frequency);  // Output: A3B2C1D2
    }
}
