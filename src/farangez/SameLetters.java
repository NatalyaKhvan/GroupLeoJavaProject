package farangez;

import java.util.Arrays;

public class SameLetters {
   /* String - Same letters
    Write a return method that checks if a string is built out of the same letters as another string.
    Ex: same("abc", "cab"); ==> true
    same("abc", "abb"); ==> false

    */
   public static void main(String[] args) {
       System.out.println(SameLettersMethod("acb", "abc"));
   }

    public static boolean SameLettersMethod(String letters1, String letters2){
       String [] lettersOne = letters1.split("");
         String [] lettersTwo= letters2.split("");
         Arrays.sort(lettersOne);
         Arrays.sort(lettersTwo);
        if( Arrays.equals(lettersOne, lettersTwo)){
            return true;
        }

        return false;
    }

}
