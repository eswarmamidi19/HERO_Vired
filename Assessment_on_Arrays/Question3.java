import java.util.Arrays;

public class Question3 {
    public static void main(String[] args) {
        int[] arr= {23, 21, 44, 32, 12};
        Arrays.sort(arr);
        System.out.print(" The elements in ascending order :  ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print(" The elements in descending order :  ");
        for (int i = arr.length-1; i >=0; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}
