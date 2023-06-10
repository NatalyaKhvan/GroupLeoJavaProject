package natalya;

import java.util.Arrays;
import java.util.Scanner;

public class SameLetters {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter string 1: ");
        String str1 = input.nextLine();
        System.out.println("Enter string 2: ");
        String str2 = input.nextLine();


        System.out.println(sameLetters(str1, str2));

        input.close();
    }


    public static boolean sameLetters(String str1, String str2) {

        String[] arr1 = str1.split("");
        Arrays.sort(arr1);

        String[] arr2 = str2.split("");
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}

        /*
        String - Same letters
Write a return method that checks if a string is built out of the same letters as another string.
  Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false
         */


