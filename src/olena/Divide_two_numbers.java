package olena;
/* Numbers - Divide without / operator:
Write a method that can divide two numbers without using division operator*/
public class Divide_two_numbers {
    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }

        // Determine the sign of the result there
        int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;

        // Convert dividend and divisor to positive values
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        int quotient = 0;
        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }

        return sign * quotient;
    }

    public static void main(String[] args) {
        int dividend = 20;
        int divisor = 5;

        int result = divide(dividend, divisor);
        System.out.println("Result: " + result); // Output: Result: 4
    }
}
