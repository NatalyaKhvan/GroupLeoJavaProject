package AMIN;

import java.util.Scanner;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a String ");
        String str = input.next();


        input.close();
        frequencyOfChar(str);

    }
    public static void frequencyOfChar(String str){

        String result = "";


        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == ch){
                    count++;
                }
            }

            if(result.contains(""+ch)){
                continue;
            }

            result +=  ch + "" + count;

        }


        System.out.println(result);








    }


}



