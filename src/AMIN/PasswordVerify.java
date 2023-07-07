package AMIN;

import java.util.Scanner;

public class PasswordVerify {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter password: ");
        String str = input.nextLine();
        verifyPassword(str);
    }

    public static void verifyPassword(String str) {

        boolean has6ChNoSpace = str.length() >= 6 && !str.contains(" ");
        int digit=0;
        int special=0;
        int upCount=0;
        int loCount=0;

        for(int i =0;i<str.length();i++){
            char c = str.charAt(i);
            if(Character.isUpperCase(c)){
                upCount++;
            }
            else if(Character.isLowerCase(c)){
                loCount++;
            }
            else if(Character.isDigit(c)){
                digit++;
            }else{
                special++;

            }

        }
        if(special>=1&&loCount>=1&&upCount>=1&&digit>=1 &&has6ChNoSpace){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}

