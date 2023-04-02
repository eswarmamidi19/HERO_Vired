/**
 * Question1
 */
public class Question1 {

    public static void main(String[] args) {
        int[] arr =  {31, 42, 25, 21, 56,  61, 13, 45, 76, 55};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        double average =0;
        for (int i = 0; i < arr.length; i++) {
             min = Math.min(min, arr[i]);
             max =Math.max(max, arr[i]);
             average+=(double)arr[i];
            }
            System.out.println("The element with minimum value "+ min);
            System.out.println("The element with maximum value "+ max);
            System.out.println("Average of all array elements is"+ average/arr.length);
            System.out.println("total number of array elements "+ arr.length);
    }
}