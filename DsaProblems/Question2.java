import java.io.*;
import java.math.*;
import java.util.*;




public class Question2 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int[][] mat = new int[6][6];
      for(int i=0;i<6;i++){
          for(int j=0;j<6;j++){
              mat[i][j] = sc.nextInt();
          }
      }
      int max = Integer.MIN_VALUE;
      for(int i=0;i<4;i++){
          for(int j=0;j<4;j++){
             max = Math.max(max,getSum(mat, i, j));
          }
      }
      System.out.print(max);
      sc.close();
    }
    public static int getSum(int[][] mat,int i1,int j1){
        int sum =0;
        for(int i=i1;i<=i1+2;i++){
            for(int j=j1;j<=j1+2;j++){
                sum+= mat[i][j];
            }  
        }
        return sum-mat[i1+1][j1]-mat[i1+1][j1+2];
        
       
    }
}
