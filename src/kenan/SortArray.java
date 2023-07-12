package kenan;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};
        arr = sortAscending(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        // Output: 7 8 9 10
    }

    public static int[] sortAscending(int[] arr) {
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
    }
}
