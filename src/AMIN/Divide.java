package AMIN;

import java.util.Scanner;

public class Divide {


        public static void main(String[] args) {
            int result = 0;
            Scanner input =new Scanner(System.in);
            System.out.println("Enter first ");
            int a = input.nextInt();
            System.out.println("Enter second");
            int b = input.nextInt();
            int c = a + b;

            while(c>b)
            {
                c = c - b;
                result ++;
            }

            System.out.println("the result is : "+ result);

        }
    }

