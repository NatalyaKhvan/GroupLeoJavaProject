package AMIN;

public class Divisible_by_15_3_5 {
    public static void main(String[] args) {
        System.out.print("Divided by 15 ");
        for (int i=1; i<=100; i++) {
            if (i%3==0 && i%5==0)
                System.out.print(i +" ");
        }
        System.out.println();
        System.out.print("Divided by 5 ");
        for (int i=1; i<=100; i++) {
            if (i%5==0)
                System.out.print(i +" ");
        }
        System.out.println();
        System.out.print("Divided by 3 ");
        for (int i=1; i<=100; i++) {
            if (i%3==0)
                System.out.print(i +" ");
        }
    }
}


