import java.util.Scanner;

/**
 * MissingNumbers
 */
public class Q1 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        int max_size = 0;
        for (int i = 0; i < arr.length; i++) {
            max_size = Math.max(max_size, arr[i]);
        }
        int[] is_appeared = new int[max_size+1];
        for(int i=0;i<n;i++){
            is_appeared[arr[i]]++;
        }
       for (int i = 1; i < is_appeared.length; i++) {
           if(is_appeared[i]==0){
            System.out.print(i+"  ");
           }
       }
        sc.close();
    }

}