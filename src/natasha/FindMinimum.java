package natasha;

import java.util.Scanner;

public class FindMinimum {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();
            int[] arr = new int[size];

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
            }

            int minimum = findMinimum(arr);
            System.out.println("Minimum number: " + minimum);

            scanner.close();
        }

        public static int findMinimum(int[] arr) {
            if (arr == null || arr.length == 0) {
                throw new IllegalArgumentException("Array must not be empty or null");
            }

            int minimum = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < minimum) {
                    minimum = arr[i];
                }
            }

            return minimum;
        }
    }


