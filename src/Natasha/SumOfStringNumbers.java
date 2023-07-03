package Natasha;

public class SumOfStringNumbers {
    /*  String_SumOfAllDigits
Write a method that can return the sum of the digits in a string
Ex:  "12 java 5 apple 3"  ==>  20*/

        public static int sumOfDigits(String str) {
            int sum = 0;
            for (int i = 0; i < str.length(); i++) {
                char number = str.charAt(i);
                if (Character.isDigit(number)) {
                    int digit = Character.getNumericValue(number);
                    sum += digit;
                }
            }
            return sum;
        }

        public static void main(String[] args) {
            String str = "12 java 5 apple 3";
            int sum = sumOfDigits(str);
            System.out.println(sum);
        }
    }

