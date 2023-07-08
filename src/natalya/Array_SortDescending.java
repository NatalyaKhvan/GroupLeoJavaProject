package natalya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_SortDescending {


    public static void main(String[] args) {

        int[] arr = {10, 20, 7, 8, 90};

        System.out.println("array_sortDescending(arr) = " + Arrays.toString(array_sortDescending(arr)));

    }


    /*
    Array_SortDescending
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
arr = sortDescending(arr); ==> {90, 20, 10, 8, 7};
     */

    public static int[] array_sortDescending(int[] arr) {

        Arrays.sort(arr);

        int[] reverse = new int[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--) {

            reverse[j++] = arr[i];
        }

        return reverse;

    }

}