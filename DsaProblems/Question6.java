
import java.util.*;


public class Question6 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<n;i++){
            int ele = sc.nextInt();
            al.add(ele);
        }
        int q = sc.nextInt();
        while(q-->0){
            String str = sc.next();
            if(str.equals("Insert")){
                int ind = sc.nextInt();
                int ele = sc.nextInt();
                al.add(ind, ele);
            }
            else{
                
                al.remove(sc.nextInt());
            }
        }
       for(Integer ele : al){
           System.out.print(ele+" ");
       }
       sc.close();
    }
}
