package natalya;

public class MaxNumInArray {

    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        System.out.println("maxNumberInArray(arr) = " + maxNumberInArray(arr));
    }


    /*
    Write a method that can find the maximum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
     */

    public static int maxNumberInArray(int[] arr) {

        int max = arr[0];

        for (int each : arr) {

            if (each > max) {
                max = each;
            }

        }
        return max;

    }
}
