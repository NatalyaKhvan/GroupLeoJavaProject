package farangez;



public class FrequencyOfCharacters {
    public static void main(String[] args) {
        /*
Write a return method that can find the frequency of characters
  Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
         */
        System.out.println(FrequencyChars("aaddbbcc"));


    }

    public static String FrequencyChars(String chars){
        String result  ="";

        for(int j=0;j<chars.length(); j++){
            char each=chars.charAt(j);
            int frequency = 0;

            for(int i=0; i<chars.length();i++){
                if(chars.charAt(i)==each){
                    frequency++;
                }
            }
            if(result.contains((each+""))){
                continue;
            }
            result+=each+""+frequency;
        }

       return result;



    }
}
