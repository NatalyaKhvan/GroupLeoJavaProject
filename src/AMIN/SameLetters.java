package AMIN;

import java.util.Arrays;
import java.util.Scanner;

public class SameLetters {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter a word1 ");
        String  str1 = input.next();
        System.out.println("enter a word2 ");
        String  str2 = input.next();
        sameLetter(str1,str2);
        input.close();
    }

    public static void sameLetter(String str1 ,String  str2){
        char[] left = str1.toCharArray();
        char[] right = str2.toCharArray();
        Arrays.sort(left);
        Arrays.sort(right);
        System.out.println(Arrays.equals(left, right));
    }
}

