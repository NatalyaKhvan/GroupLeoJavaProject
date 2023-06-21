package natalya;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a a sequence of characters: ");
        String str = input.nextLine();

        System.out.println(reverse(str));

        input.close();

    }

    /*
    Write a return method that can reverse  String
    Ex: Reverse("ABCD"); ==> DCBA
     */

    public static String reverse(String str){

        String reverse = "";

        for(int i = str.length()-1; i>=0; i--){
            reverse+=str.charAt(i);
        }

        return reverse;
    }


}
