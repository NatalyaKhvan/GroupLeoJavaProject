package natasha;
//Numbers -- Swap Numbers
// Swap two variable values without using a third variable
public class SwapNumbers {
    public static void swapMethod(int x, int y){
        x = x+y;
        y = x-y;
        x=x-y;
        System.out.println("x is "+x+ " and y is "+y);
    }

    public static void main(String[] args) {
        swapMethod(5, 9);

    }
}
