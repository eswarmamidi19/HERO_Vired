/**
 * Q1
 */
public class Q1 {

    public static void main(String[] args) {
        int[] arr = {25, 35, 12, 4, 36, 48};
        int[] ans = new int[arr.length];
        ans[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            ans[i] = ans[i-1]+arr[i];
        }
        for (int i : ans) {
            System.out.print(i+" ");
        }
    }
}