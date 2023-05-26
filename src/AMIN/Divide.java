package AMIN;

import java.util.Scanner;

public class Divide {


        public static void main(String[] args) {

            divide(66,4);

        }

        public static void divide(int a,int b){
            if (b==0){
                System.out.println("Invalid number");
                System.exit(0);
            }
            int result =0;
            while(a >= b){
                a-=b;
                result++;
            }
            System.out.println("RESULT "+result+" REMAINDER "+ a);
        }

    }

