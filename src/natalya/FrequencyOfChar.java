package natalya;

import java.util.Scanner;

public class FrequencyOfChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = input.nextLine();


        System.out.println(frequencyOfChar(str));

        input.close();

    }
        /*
        String - Frequency of Characters
Write a return method that can find the frequency of characters
  Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
         */

    public static String frequencyOfChar(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(j) == ch) {
                    count++;
                }
            }

            if (count > 0 && !result.contains("" + ch)) {
                result += ch + "" + count;
            }
        }

        return result;
    }

}

