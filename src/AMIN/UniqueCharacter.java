package AMIN;

import java.util.Scanner;

public class UniqueCharacter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String str =input.nextLine();

        uniqueCharacters(str);
    }

    public static void uniqueCharacters(String str) {

        String result="";
        for (int i = 0; i <= str.length() - 1; i++) {
            char ch = str.charAt(i);
            if (result.indexOf(ch)==-1) {
                result=result+ch;
            }
        }
        System.out.println(result+" ");
    }
}
