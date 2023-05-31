package natalya;

public class ConsecutiveNumbers {

    public static void main(String[] args) {

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


        // divisibleBy2 ==> Codility
        // divisibleBy3 ==>Test
        // divisibleBy5 ==>Coders
        // divisibleBy2 && divisibleBy3 ==> CodilityTest
        // divisibleBy2 && divisibleBy5 ==> CodilityCoders
        // divisibleBy3 && divisibleBy5 ==> TestCoders
        // divisibleBy2 && divisibleBy3 && divisibleBy5 ==> CodilityTestCoders

        int n = 17;

        String divBy2 = "Codility";
        String divBy3 = "Test";
        String divBy5 = "Coders";

        for (int i = 1; i < n; i++) {

            boolean divisibleBy2 = i % 2 == 0;
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy2 && !divisibleBy3 && !divisibleBy5) { // divisibleBy2
                System.out.println(divBy2);
            } else if (divisibleBy2 && divisibleBy3 && !divisibleBy5) { // divisibleBy2 && divisibleBy3
                System.out.println(divBy2 + divBy3);
            } else if (divisibleBy2 && !divisibleBy3 && divisibleBy5) { // divisibleBy2 && divisibleBy5
                System.out.println(divBy2 + divBy5);
            } else if (!divisibleBy2 && divisibleBy3 && !divisibleBy5) { // divisibleBy3
                System.out.println(divBy3);
            } else if (!divisibleBy2 && divisibleBy3 && divisibleBy5) { // divisibleBy3 && divisibleBy5
                System.out.println(divBy3 + divBy5);
            } else if (!divisibleBy2 && !divisibleBy3 && divisibleBy5) { // divisibleBy5
                System.out.println(divBy5);
            } else if (divisibleBy2 && divisibleBy3 && divisibleBy5) { // divisibleBy2 && divisibleBy3 && divisibleBy5
                System.out.println(divBy2 + divBy3 + divBy5);
            } else {
                System.out.println(i);
            }
        }
    }
}


