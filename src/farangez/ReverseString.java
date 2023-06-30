package farangez;

public class ReverseString {

    public static void main(String args[]){

        StringBuffer str = new StringBuffer("Hello World!");

        str.reverse();

        System.out.println("Reversed string: "+ str);

        System.out.println("-----------------");

        String str2 = "Java";
        String reversed = "";

        for(int i  = str2.length()-1; i>=0; i--){
            reversed+=str2.charAt(i);

        }

        System.out.println(reversed);

    }
}
