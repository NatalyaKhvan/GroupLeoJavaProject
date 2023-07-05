package AMIN;

import java.util.Scanner;

public class SumDigitString {
        public static void main(String[] args) {
            Scanner input =new Scanner(System.in);
            System.out.println("enter a word ");
            String  str = input.next();
            sum(str);
        }
        public static void sum(String str){
            int sum = 0;

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (Character.isDigit(ch)) {
                    int n = Integer.parseInt(String.valueOf(ch));
                    sum = sum + n;
                }
            }
            System.out.println(sum);
        }

    }
