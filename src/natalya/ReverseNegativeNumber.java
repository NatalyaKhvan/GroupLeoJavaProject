package natalya;

public class ReverseNegativeNumber {

    public static void main(String[] args) {

        System.out.println(reverseDigits(-5796));
        System.out.println(reverseDigits(-35));

    }

    public static int reverseDigits(int num) {

        /*
    **Numbers -- Reverse Negative Number**
    Write a return method that can reverse digits of a negative number and return it as int
    input: -35  output: -53
     */

        String reverse = "-";
        num = Math.abs(num);

        String number = String.valueOf(Integer.valueOf(num));

        for (int i = number.length() - 1; i >= 0; i--) {
            reverse += number.charAt(i);
        }

        num = Integer.parseInt(reverse);
        return num;
    }
}
