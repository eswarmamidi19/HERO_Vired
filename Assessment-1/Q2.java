import java.util.Arrays;

/**
 * unqiue_elements
 */
public class Q2 {

    public static void main(String[] args) {
        // int[] arr = {1,2,2,1,3,4,3,4,1,5,3,5};
        int[] arr = {1,2,2,1,6,2,3,6,1,3,3};
        Arrays.sort(arr);
        int i=1;
        int j =1;
        while(j<arr.length){
             if(arr[j]==arr[j-1]){
                j++;
             }
            else{
                arr[i] = arr[j];
                i++;
                j++;
            }
        }
        for (int k=0;k<i;k++) {
            System.out.print(arr[k]+" ");
        }
        
    }
}