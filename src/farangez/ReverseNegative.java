package farangez;

public class ReverseNegative {
    public static void main(String[] args) {

        System.out.println( reverse(-45));
    }
    /*
    Write a return method that can reverse digits of a negative number and return it as int
    input: -35  output: -53
     */

    public static int reverse(int num){
        int reverse=0;
        while(num!=0){//45
            int remainder = num%10;//5
            reverse=reverse*10+remainder;//
            num=num/10;
        }
        return  reverse;
    }


}
