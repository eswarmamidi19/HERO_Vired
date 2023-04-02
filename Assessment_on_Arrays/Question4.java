public class Question4 {
    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {2, 29, 51, 8, 4};
        int maxPrime = -1;
        for (int i = 0; i < arr.length; i++) {
             if(isPrime(arr[i])){
                maxPrime = Math.max(maxPrime, arr[i]);
             }
        }
        System.out.println(maxPrime);
    }
}
