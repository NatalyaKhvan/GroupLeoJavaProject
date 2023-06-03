package kenan;

public class SwapNumbers {
    public static void main(String[] args) {

        int k=25;
        int m=13;

        k=k * m;
        m=k / m;
        k=k / m;

        System.out.println("k = " + k);
        System.out.println("m = " + m);

    }
}
