package natasha;

import java.util.Scanner;

public class SortAscending {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();
            int[] arr = new int[size];

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
            }

            arr = sortAscending(arr);

            System.out.println("Sorted array in ascending order:");
            for (int num : arr) {
                System.out.print(num + " ");
            }

            scanner.close();
        }

        public static int[] sortAscending(int[] arr) {
            if (arr == null || arr.length == 0) {
                throw new IllegalArgumentException("Array must not be empty or null");
            }

            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        // Swap arr[j] and arr[j + 1]
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }

            return arr;
        }}
