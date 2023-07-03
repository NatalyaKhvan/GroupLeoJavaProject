package natalya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SumOfDigitsInAString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        System.out.println(sumOfDigitsInAString(str));
        input.close();

    }


    /*
   Write a method that can return the sum of the digits in a string
Ex:  "12 java 5 apple 3"  ==>  20
    */
    public static int sumOfDigitsInAString(String str) {

        String[] arr1 = str.split(" ");
        System.out.println(Arrays.toString(arr1));

        int sum = 0;

        for (String eachElement : arr1) {

            char[] arr2 = eachElement.toCharArray();
            //System.out.println(Arrays.toString(arr2));

            for (char eachChar : arr2) {

                boolean isDigit = Character.isDigit(eachChar);
                //System.out.println("Character.isDigit(each2) = " + Character.isDigit(eachChar));

                if (isDigit) {
                    sum += Integer.valueOf(eachElement);
                   // System.out.println("sum = " + sum);
                    break;

                }
            }
        }
        return sum;
    }
}



