package kenan;

public class DivideTwoNumbers {
    public static void main(String[] args) {

        System.out.println(divide(15,5));
    }
    public static int divide(int dividend, int divisor){
        int result=0;
        int count= dividend + divisor;
        while (count>divisor){
            count=count-divisor;
            result++;
        }

        return result;
    }
}
