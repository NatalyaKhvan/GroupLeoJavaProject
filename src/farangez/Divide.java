package farangez;

public class Divide {
    public static void main(String[] args) {
        divideWithNoOperator(45,5);
    }
    public static void divideWithNoOperator(int divident, int divisor) {
        int count = 0;
        while (divident >= divisor) {
            divident -= divisor;
            count++;
        }

        System.out.println(count+" with a remainder of "+divident);
    }
}
