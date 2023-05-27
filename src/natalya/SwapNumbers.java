package natalya;

public class SwapNumbers {
    public static void main(String[] args) {

        /*
        Numbers -- Swap Numbers
 Swap two variable values without using a third variable
         */

        int num1 = 7;
        int num2 = 8;

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println(num1 + ", " + num2);
    }
}
