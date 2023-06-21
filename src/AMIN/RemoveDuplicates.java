package AMIN;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println("enter a word ");
        Scanner input =new Scanner(System.in);
        String  str = input.next();
        input.close();

        removeDup(str);
    }

    public static void removeDup(String str){


        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);
            if( ! result.contains( ""+ each)  ){
                result += each;
            }

        }


        System.out.println(result);


    }

}
