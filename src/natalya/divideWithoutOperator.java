package natalya;

public class divideWithoutOperator {

    public static void main(String[] args) {

        System.out.println(divide(10, 3));

    }


    public static String divide(double num1, double num2) {

        String result = num1 + " divide " + num2 + " = ";
        int count = 0;
        double remainder = num1;

        if (num2 == 0) {
            throw new ArithmeticException("Denominator can not be 0");
        }

        while (remainder >= num2) {
            remainder -= num2;
            count++;
        }

        result += count + " remainder " + remainder;
        return result;
    }

}

/*
2 - Numbers - Divide without / operator:
Write a method that can divide two numbers without using division operator
 */
