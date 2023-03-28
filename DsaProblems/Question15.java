import java.io.*;
import java.util.*;

public class Question15 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
         String smallest = "";
        String largest = "";
        
       ArrayList<String>al =new ArrayList<>();
        for(int i=0;i<s.length()-k+1;i++)
        {
            String temp="";
            for(int j=i;j<i+k;j++)
            {
                temp+=s.charAt(j);
            }
            al.add(temp);
            temp = null;
        }
        Collections.sort(al);
        System.out.println(al.get(0));
        System.out.print(al.get(al.size()-1));
    }
}
