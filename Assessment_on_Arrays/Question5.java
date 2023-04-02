public class Question5 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 2, 1, 8, 3, 2, 1};
        int i=0;
        int j=1;
        while(j<arr.length){
            if(arr[i]!=1){
              i++;
              j++;
            }
            else if(arr[j]==1){
                j++;
            }
            else{
                int temp = arr[i];
                arr[i] =arr[j];
                arr[j]=temp;
            }
        }
        System.out.println("Array elements after moving Ones to end: ");
        for (int j2 = 0; j2 < arr.length; j2++) {
            System.out.print(arr[j2]+"  ");
        }
    }
}
