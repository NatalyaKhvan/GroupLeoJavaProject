package fara;

public class SwapNumbers {
    /*
    Numbers -- Swap Numbers
 Swap two variable values without using a third variable
     */
    public static void main(String[] args) {
        int n1=30,n2=20;

        n1=n1+n2; // n1= 50
        n2=n1-n2; // n2= 30
        n1=n1-n2; // n1=20

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
    }
}
