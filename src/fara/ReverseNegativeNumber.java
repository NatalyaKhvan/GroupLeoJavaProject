package fara;

public class ReverseNegativeNumber {
    /*
    **Numbers -- Reverse Negative Number**
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
     */

    public static void main(String[] args) {
        System.out.println(reverseNegativeNumber(-1234));

    }

    public static int reverseNegativeNumber(int num){

        boolean isNegative = num < 0 ? true : false;

        if(isNegative)
        {
            num = num * -1;
        }

        int reverse = 0;
        int lastDigit = 0;

        while (num >= 1) {
            lastDigit = num % 10; // gives you last digit
            reverse = reverse * 10 + lastDigit;
            num = num / 10; // gets rid of last digit
             }

        return isNegative == true? reverse*-1 : reverse;
    }
}
