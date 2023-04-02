import java.util.HashMap;

public class Question6 {
    public static void main(String[] args) {
        int[] arr1 = {3, 1, 3, 4, 1, 2, 1, 8, 3, 2, 1, 1, 3, 2, 3, 3, 4};
        int[] arr2 = {1, 2, 3, 5, 9};
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
          hm.put(arr1[i],hm.get(arr1[i])==null?1:hm.get(arr1[i])+1);
        }
        for (int i : arr2) {
            if(hm.get(i)!=null)
            System.out.println("Frequency of "+i+" "+hm.get(i));
            else  System.out.println("Frequency of "+i+" "+0);
        }
    }
}
