package farangez;

import java.util.Arrays;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortAscending {
  /*
   Array_SortAscending
   Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
    Ex: int[] arr = {10, 9, 8, 7};
    arr = sortAscending(arr); ==>{ 7, 8, 9, 10};
   */

  public static void main(String[] args) {
    System.out.println(Arrays.toString(sortAscending(3,4,1,3,8,6,-1,5,1,2)));
  }
  public static int[] sortAscending(int...arr) {

    for (int i = 0; i < arr.length-1; i++) {
      for (int j = 0; j < arr.length-1; j++) {//here we compare
        if (arr[j] > arr[j + 1]) {//if current position more than next
          //we need to swap
          //first we assign temp variable:
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }

    return arr;
  }
}