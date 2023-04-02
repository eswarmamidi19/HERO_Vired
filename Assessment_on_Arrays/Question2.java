public class Question2 {
    public static void main(String[] args) {
        int[] arr = {31, 42, 25, 21, 56,  61, 13, 45, 76, 55};
        System.out.println("The elements in reverse order - ");
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]+"  ");
        }
    }
}
