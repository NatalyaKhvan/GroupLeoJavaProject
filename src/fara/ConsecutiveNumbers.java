package fara;

public class ConsecutiveNumbers {
    /*
    Numbers -- print consecutive numbers
 * Write a function that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line. However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively. If a number is divisible by more than one of the numbers: 2,3 or 5, it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order. For example, numbers divisible by both 2 and 3 should be replaced by CodilityTest and numbers divisible by all three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.
 *
 * For example, here is the output for N = 17:
 * 1
 * Codility
 * Test
 * Codility
 * Coders
 * CodilityTest
 * 7
 * Codility
 * Test
 * CodilityCoders
 * 11
 * CodilityTest
 * 13
 * Codility
 * TestCoders
 * Codility
     */

    public static void main(String[] args) {
        consecutive(17);
    }

    public static void consecutive(int N){


        for (int i = 1; i <= N; i++) {
            boolean divisibleBy2= i%2==0;
            boolean divisibleBy3= i%3==0;
            boolean divisibleBy5= i%5==0;

            if (divisibleBy2 && !divisibleBy3 && !divisibleBy5){
                System.out.println("Codility");
            } else if (divisibleBy3 && !divisibleBy2 && !divisibleBy5) {
                System.out.println("Test");
            } else if(divisibleBy5 && !divisibleBy2 && !divisibleBy3){
                System.out.println("Coders");
            } else if (divisibleBy2 && divisibleBy3 && !divisibleBy5) {
                System.out.println("Codility" + "Test");
            } else if (divisibleBy3 && divisibleBy5 && !divisibleBy2) {
                System.out.println("Test" + "Coders");
            } else if (divisibleBy5 && divisibleBy2 && !divisibleBy3) {
                System.out.println("Coders" + "Codility");
            }else if(divisibleBy2 && divisibleBy3 && divisibleBy5){
                System.out.println("Codility" + "Test" + "Coders");
            }else{
                System.out.println(i);
            }
        }
    }
}
