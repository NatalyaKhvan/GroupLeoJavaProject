package AMIN;

public class Consecutive {
    public static void main(String[] args) {
        consecutive(17);
    }

    public static void consecutive(int N) {
        for (int i = 1; i <= N; i++) {
            boolean d2 = i % 2 == 0;
            boolean d3 = i % 3 == 0;
            boolean d5 = i % 5 == 0;
            if (d2 && !d3 && !d5) {
                System.out.println("Codility");
            } else if (d3 && !d2 && !d5) {
                System.out.println("Test");
            } else if (d5 && !d2 && !d3) {
                System.out.println("Coders");
            } else if (d3 && d2 && !d5) {
                System.out.println("CodilityTest");
            } else if (d5 && d2 && !d3) {
                System.out.println("CodilityCoders");
            } else if (d5 && d3 && !d2) {
                System.out.println("TestCoderss");
            }else if (d5 && d3 && d2) {
                System.out.println("CodilityTestCoders");
            }else {
                System.out.println(i);
            }
        }}
}
