package kenan;

public class ArrayFindMiniNum {

    public static void main(String[] args) {

        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        int miniNumber=findMiniNum(arr);
        System.out.println("miniNumber = " + miniNumber);

    }
    public static int findMiniNum(int[] arr){

        int mini=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < mini){
                mini=arr[i];
            }
        }
        return mini;
    }
}
