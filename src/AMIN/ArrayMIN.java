package AMIN;


public class ArrayMIN {
    public static void main(String[] args) {
        int[] array = {99, 12, 23, 32, 44, 57, 6,4};
        System.out.println(findMin(array));

    }
    public static int findMin(int[]array){

        int min = array[0];

            for (int i = 1; i < array.length; i++) {

                if (array[i]<min){
                    min =array[i];
                }

            }
            return  min ;
    }
 }
