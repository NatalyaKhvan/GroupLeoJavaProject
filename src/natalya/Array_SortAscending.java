package natalya;

import java.util.Arrays;

public class Array_SortAscending {


    public static void main(String[] args) {

        int[] arr = {10, 9, 8, 7};

        System.out.println("array_sortAscending(arr) = " + Arrays.toString(array_sortAscending(arr)));

    }


    /*
    Array_SortAscending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = sortAscending(arr); ==>{ 7, 8, 9, 10};
     */

    public static int[] array_sortAscending(int[] arr){

        Arrays.sort(arr);

        return arr;
    }

}
