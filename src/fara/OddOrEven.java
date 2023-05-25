package fara;

import java.util.Scanner;

public class OddOrEven {


        /*
        1 - Numbers- Odd or even:
Write  a method which can identify given number is even or odd
Output ex:
identify(5); ->"Odd"
identify(6); ->"Even"
         */


    public static void OddOrEven(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = input.nextInt();

        if(number %2==0){
            System.out.println(number+" is an even number");
        }else{
            System.out.println(number+ " is an odd number");
        }


    }

    public static void main(String[] args) {
        OddOrEven();
    }
}
