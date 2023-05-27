package farangez;

public class Divide {
    public static void divideWithNoOperator(int divident, int divisor) {
        int count = 0;
        while (divident >= divisor) {
            divident -= divisor;
            count++;
        }

        System.out.println(count+" with a remainder of "+divident);
    }
}
