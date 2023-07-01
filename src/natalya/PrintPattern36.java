package natalya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PrintPattern36 {

    /*
    Write a program to print the following pattern.
    Take number of rows by user's choice

    1
    2   1
    3   2   1
    4   3   2   1
    5   4   3   2   1
    6   5   4   3   2   1
    7   6   5   4   3   2   1

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number of rows: ");
        int n = input.nextInt();
        input.close();

        printReversePattern(n);
        printReversePattern2(n);

    }


    public static ArrayList<Integer> reverseArrayList(ArrayList list) {

        ArrayList reverse = new ArrayList<>();

        for (int i = list.size(); i >= 1; i--) {
            reverse.add(i);
        }
        return reverse;
    }

    public static void printReversePattern(int n) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            list.add(i);
            list = reverseArrayList(list);

            String str = list.toString().replace("[", "").replace(",", "").replace("]", "");

            System.out.println(str);
        }

    }

    public static void printReversePattern2(int n) {

        for (int i = 1; i <= n; i++) {
            int count = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count--;
            }
            System.out.println();
        }

    }
}

