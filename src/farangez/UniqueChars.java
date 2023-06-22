package farangez;

import java.util.Scanner;

public class UniqueChars {
    /* Write a return  method that can find the unique characters from the String
     Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string of characters: ");

        String str = input.nextLine();
        System.out.println(uniqueCharacters(str));
        input.close();

       // System.out.println("uniqueCharacters( \"AAABBBCCDEF\") = " + uniqueCharacters("AAABBBCCDEF"));


    }

    public static String uniqueCharacters(String str) {

        String result = "";

        for(int i=0; i<str.length(); i++){//iterate through string

            char ch = str.charAt(i);
           int  frequency=0;

            for (int j = 0; j < str.length(); j++) {//iterate once more
                if(str.charAt(j)==ch){//compare if this chars equal to the ch
                    frequency++;
                }
            }

            if(frequency==1){//if character is seen once, add it to new string result
                result+=ch;
            }


        }
        return result;
    }


}
