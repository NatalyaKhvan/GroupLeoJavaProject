package kenan;

import java.util.Scanner;

public class RemoveDuplicates {

    public static String removeDuplicates(String str){

        String result="";
        for (int i = 0; i < str.length(); i++) {
            int count=0;
            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i)==str.charAt(j)){
                    count++;
                }
                if (count > 0 && !result.contains("" + str.charAt(i))) {
                    result += "" + str.charAt(i);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string");
        String str= input.nextLine();

        System.out.println(removeDuplicates(str));
        input.close();
    }
}
