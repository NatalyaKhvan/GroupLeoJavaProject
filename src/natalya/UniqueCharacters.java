package natalya;

import java.util.Scanner;

public class UniqueCharacters {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a a sequence of characters: ");
        String str = input.nextLine();

        System.out.println(uniqueCharacters(str));

        input.close();

    }


    /*
    Write a return  method that can find the unique characters from the String
    Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
*/
    public static String uniqueCharacters(String str) {

        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int frequency = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    frequency++;
                }
            }

            if (frequency == 1) {
                unique += ch;
            }
        }

        return unique;
    }
}
