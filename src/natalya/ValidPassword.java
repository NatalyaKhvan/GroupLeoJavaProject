package natalya;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class ValidPassword {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String str = input.nextLine();

        input.close();

        System.out.println(isValidPassword(str));
    }


    /*
        1. Write a return method that can verify if a password is valid or not.
    requirements:
    1. Password MUST be at least have 6 characters and should not contain space
    2. PassWord should at least contain one upper-case letter
    3. PassWord should at least contain one lowercase letter
    4. Password should at least contain one special character
    5. Password should at least contain a digit
    if all requirements above are met, the method returns true, otherwise returns  false
         */
    public static boolean isValidPassword(String str) {

        boolean isValid = true;
        boolean has6Characters = str.length() >= 6;
        boolean hasNoSpace = !str.contains(" ");
        int hasUpperCount = 0;
        int hasLowerCount = 0;
        int hasSpecCharCount = 0;
        int hasDigitCount = 0;


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasUpperCount++;
            }

            if (Character.isLowerCase(ch)) {
                hasLowerCount++;
            }

            if (!Character.isLetterOrDigit(ch)) {
                hasSpecCharCount++;
            }

            if (Character.isDigit(ch)) {
                hasDigitCount++;
            }
        }
        if (!has6Characters || !hasNoSpace || hasUpperCount < 1 || hasLowerCount < 1 || hasSpecCharCount < 1 || hasDigitCount < 1) {
            isValid = false;
        }
        return isValid;
    }
}



