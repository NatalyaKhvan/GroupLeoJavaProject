package Natasha;

/*Numbers -- print consecutive numbers
 * Write a function that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line. However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively. If a number is divisible by more than one of the numbers: 2,3 or 5, it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order. For example, numbers divisible by both 2 and 3 should be replaced by CodilityTest and numbers divisible by all three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.
*/
public class Consecutive {
    public static void consecutiveN(int num) {
        String divBy2 = "Codility";
        String divBy3 = "Test";
        String divBy5 = "Coders";
        String result = "";

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                result += divBy2 + divBy3 + divBy5 + "\n";
            } else if (i % 2 == 0 && i % 3 == 0) {
                result += divBy2 + divBy3 + "\n";
            } else if (i % 2 == 0 && i % 5 == 0) {
                result += divBy2 + divBy5 + "\n";
            } else if (i % 3 == 0 && i % 5 == 0) {
                result += divBy3 + divBy5 + "\n";
            } else if (i % 2 == 0) {
                result += divBy2 + "\n";
            } else if (i % 3 == 0) {
                result += divBy3 + "\n";
            } else if (i % 5 == 0) {
                result += divBy5 + "\n";
            } else {
                result += i + "\n";
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        consecutiveN(17);


            }
        };

