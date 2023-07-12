package AMIN;

import java.util.Arrays;


public class AscendingDescendingArray {

    public static void main(String[] args) {
        int[] array = {99, 12, 23, 32, 44, 57, 6, 4};
        System.out.println(Arrays.toString(ascendingArray(array)));
      //  System.out.println(Arrays.toString(descendingArray(array)));

    }

    public static int[] ascendingArray(int[] array) {
        Arrays.sort(array);

        return array;
    }

//    public static int[] descendingArray(int[] array) {
//        Arrays.sort(array);
//        int n = array.length;
//
//       for (int i = 0; i < n / 2; i++) {
//
//          int temp = array[i];
//
//           array[i] = array[n - i - 1];
//
//           array[n - i - 1] = temp;
//
//        }
//        return array;
   // }

}
