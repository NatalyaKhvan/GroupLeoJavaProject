package olena;

public class ReverseNegativeNumber {
    public static int reverseNegativeNumber(int number) {
        if (number >= 0) {
            // we check if the input number is greater than or equal to zero. If it is, the number is positive or zero, so we simply return the number as it is
            return number; //return input number is not a negative number
        }

        String numberString = String.valueOf(number);
        //Converts the input number to a string representation using, String.valueOf(). This allows us to manipulate the number as a string.
        String reversedString = new StringBuilder(numberString.substring(1)).reverse().toString();
        //StringBuilder object with the substring of numberString starting from index 1
        int reversedNumber = Integer.parseInt(reversedString);
        return -reversedNumber;//return (reversedNumber;): Returns the negation of the reversed number by multiplying it by -1.
    }

    public static void main(String[] args) {// Defines the main method
        int number = -35;//integer variable number and assigns it the value -35
        int reversedNumber = reverseNegativeNumber(number);//method, passing the number as an argument, and assigns the returned value to the reversedNumber variable.
        System.out.println(reversedNumber);//Prints the value of reversedNumber
    }
}
