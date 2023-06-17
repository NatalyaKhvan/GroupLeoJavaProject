package farangez;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDUplicates {
    /*
    String - Remove Duplicates
Write a return method that can remove the duplicated values from the String
  Ex: removeDup("AAABBBCCC") ==> ABC
     */
    public static void main(String[] args) {
       System.out.println(RemoveDuplicates("AAABBBCCC"));

    }


    public static String RemoveDuplicates(String str){
        String new_str= "";
        for(int i=0; i>str.length();i++){
            char ch = str.charAt(i);
      for(int j=0; j<str.length();j++){
                if(str.charAt(i)==ch){
                    continue;
                }
              new_str+=ch;
            }
        }

       // Set<String> newSet= new HashSet<>(Arrays.asList(str));
        return new_str;
    }
}
