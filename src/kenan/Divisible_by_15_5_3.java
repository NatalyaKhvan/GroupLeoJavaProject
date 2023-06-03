package kenan;

public class Divisible_by_15_5_3 {
    public static void main(String[] args) {



        System.out.print(" Divisible by 15: ");
        for (int i = 1; i <100 ; i++) {
            if (i % 15 == 0) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.print(" Divisible by 3: ");
        for (int i = 1; i <100 ; i++) {
            if (i % 3 ==0 && i % 15 !=0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.print(" Divisible by 5: ");
        for (int i = 1; i <100 ; i++) {
            if (i % 5 ==0 && i % 15 !=0){
                System.out.print(i+" ");
            }
        }





    }
}
