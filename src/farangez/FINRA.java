package farangez;

public class FINRA {
    public static void main(String[] args) {
        FINRA();
    }

    public static void FINRA() {
        for (int i = 1; i <= 30; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FINRA ");
            } else if (i % 3 == 0) {
                System.out.print("FIN ");
            } else {
                System.out.print("RA ");

            }
        }
    }
}
