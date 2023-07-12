package kenan;

public class MaxNumber {

        public static void main(String[] args) {
            int[] arr = {99, 12, 23, 32, 44, 57, 6};
            int maxNumber = findMaximumNumber(arr);
            System.out.println("Maximum number: " + maxNumber);
        }

        public static int findMaximumNumber(int[] arr) {


            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }

            return max;
        }
    }








