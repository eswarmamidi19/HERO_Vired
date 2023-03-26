import java.io.*;
import java.util.*;
public class Question3 {

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum<0)count++;
            }
            
        }
        System.out.print(count);
       sc.close();
    }
}

