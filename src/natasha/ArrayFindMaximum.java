package natasha;

public class ArrayFindMaximum {
        public static int findMaximum(int[] arr) {
            if (arr == null || arr.length == 0) {
                throw new IllegalArgumentException("Array is empty or null");
            }

            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }

            return max;
        }

        public static void main(String[] args) {
            int[] arr = {99, 12, 23, 32, 44, 57, 6};
            int maximum = findMaximum(arr);
            System.out.println(maximum);
        }
    }
