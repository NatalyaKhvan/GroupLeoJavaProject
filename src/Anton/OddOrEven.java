package Anton;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        input.close();

        if (number % 2 == 0){
            System.out.println(number + " is a even number");
        }else{
            System.out.println(number + " is a odd number");
        }
    }
}
