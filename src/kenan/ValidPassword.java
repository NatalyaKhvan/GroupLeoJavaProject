package kenan;

import java.util.Scanner;

public class ValidPassword {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("enter your password");
        String password= input.nextLine();
        verifyPassword(password);


    }
    public static void verifyPassword(String password){

        boolean has6CharacterNoSpace= password.length() >=6 && !password.contains(" ");
        int digit=0;
        int special=0;
        int upCount=0;
        int loCount=0;

        for (int i = 0; i < password.length(); i++) {
            char ch =password.charAt(i);
            if (Character.isUpperCase(ch)){
                upCount++;
            } else if (Character.isLowerCase(ch)) {
                loCount++;
            } else if (Character.isDigit(ch)) {
                digit++;
            }else {
                special++;
            }

        }
        if (special>=1 && loCount>=1 && upCount>=1 &&has6CharacterNoSpace){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
