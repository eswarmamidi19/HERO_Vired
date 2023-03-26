/**
 * Question4
 */

import java.util.*;

 class Question4 {

    public static void main(String[] args) {
       
      Scanner sc = new Scanner(System.in);
      ArrayList<ArrayList<Integer>> al = new ArrayList<>();
      int t = sc.nextInt();
       while(t-- >0){
           int n=sc.nextInt();
           ArrayList<Integer> a = new ArrayList<>();
           for(int i=0;i<n;i++){
               int ele = sc.nextInt();
               a.add(ele);
           }
           al.add(a);
       }
    //    System.out.println(al);
    int t1 = sc.nextInt();
     while(t1-->0){
         int arrayNumber = sc.nextInt();
         int index = sc.nextInt();
         arrayNumber=arrayNumber-1;
         index = index-1;
        //  System.out.println(al.get(arrayNumber));
         if(index>=al.get(arrayNumber).size()){
            System.out.println("ERROR!");
         }
         else{
             System.out.println(al.get(arrayNumber).get(index));
         }
     }
     sc.close();
    }
}