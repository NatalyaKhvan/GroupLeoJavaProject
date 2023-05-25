package Anton;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        Identify(number);

        input.close();
    }
    private static void Identify(int a){

        if (a % 2 == 0){
            System.out.println(a + " is a even number");
        }else
            System.out.println(a + " is a odd number");
    }
}


