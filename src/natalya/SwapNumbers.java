package natalya;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter num1:");
        int num1 = input.nextInt();

        System.out.println("Enter num2:");
        int num2 = input.nextInt();

        System.out.println(swapNumbers(num1,num2));

        input.close();

    }

    public static String swapNumbers(int num1, int num2){
        /*
        Numbers -- Swap Numbers
 Swap two variable values without using a third variable
         */


        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        return num1 + ", " + num2;
    }
}
