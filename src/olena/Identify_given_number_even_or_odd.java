package olena;
/*Numbers- Odd or even:
Write  a method which can identify given number is even or odd
Output ex:
identify(5); ->"Odd"
identify(6); ->"Even"
*/
public class Identify_given_number_even_or_odd {
    public static String identify(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 6;

        System.out.println(identify(num1)); // Output: Odd
        System.out.println(identify(num2)); // Output: Even
    }
}
