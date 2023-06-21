package AMIN;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String str =input.nextLine();
        reverse(str);

    }
    public static void reverse(String str){

        String reverse ="";
        for(int i=str.length()-1; i>=0; i--) {
            reverse = reverse + str.charAt(i);
        }
        System.out.println(reverse);

    }

}

