package kenan;

import java.util.Arrays;
import java.util.Scanner;

public class HasSameLetters {

    public static boolean hasSameLetters(String str1, String str2){

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        char[] sortedStr1= str1.toCharArray();
        char[] sortedStr2= str2.toCharArray();

        Arrays.sort(sortedStr1);
        Arrays.sort(sortedStr2);

        return Arrays.equals(sortedStr1,sortedStr2);
    }

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter first string");
        String str1= input.nextLine();
        System.out.println("Enter second string");
        String str2= input.nextLine();

        boolean result= hasSameLetters(str1,str2);
        System.out.println(result);

        input.close();

    }
}
