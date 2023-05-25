package AMIN;

public class OddEven {
    public static void main(String[] args) {

        identify(10);
    }

    public static void identify(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " -> Even");
        } else {
            System.out.println(n + " -> Odd");

        }
    }

}

