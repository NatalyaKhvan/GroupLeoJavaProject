package farangez;

public class Prime {
    public static void main(String[] args) {
        System.out.println(isPrime(9));
    }


    public static boolean isPrime(int num){

        for(int i=2; i<=num; i++){
            if(num%i==0){
                return false;
            }
        }
    return true;
    }
}
