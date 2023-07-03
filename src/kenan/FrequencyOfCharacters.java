package kenan;

import java.util.Scanner;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter a string");
        String str = input.nextLine();

        System.out.println(FrequencyOfCharacters(str));
        input.close();


    }

    public static String FrequencyOfCharacters(String str) {
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
