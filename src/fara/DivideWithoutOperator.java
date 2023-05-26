package fara;

public class DivideWithoutOperator {
    public static void Divide2Numbers() {

        int dividend = 50;
        int divisor = 9;

        int quotient = 0;

        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }

        System.out.println(quotient + " with a remainder of " + dividend);

    }
    public static void main(String[] args) {
        Divide2Numbers();

    }
}

 /*
 2 - Numbers - Divide without / operator:
Write a method that can divide two numbers without using division operator
         */