/**
 * InventoryManageMent1
 */
import java.util.*;
public class Q3 {
static final int size =10;
static int i=0;
public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int[] ids = new int[size];
      int[] count = new int[size];
      int[] cost = new int[size];
      String[] specs = new String[size];
      int again = 1;
      while(again!=0){
            System.out.println("1 display the list ");
            System.out.println("2 display the count ");
            System.out.println("3 get details");
            System.out.println("4 edit a product ");
            System.out.println("5 add the product");
            System.out.println("6 delete a product");
            System.out.println("7 exit ");
            System.out.println("enter one of the options");
            int n = sc.nextInt();
            if(n==1){
                  display(ids, count, cost, specs);
            }
            else if(n==2){
                  System.out.println(i);
            }
            else if(n==3){
                  System.out.println("enter the id of new ");
                  int id = sc.nextInt();
                  get_details(id, ids, count, cost, specs);
            }
            else if(n==4){
                  System.out.println("enter id :");
               int id = sc.nextInt();
                  System.out.println("enter the new count ");
               int cnt = sc.nextInt();
               System.out.println("enter the new cost ");
               int cst = sc.nextInt();
              edit(id, cnt, cst, ids, count, cost, specs);
            }
            else if(n==5){
                  System.out.println("enter new id ");
                  int id = sc.nextInt();
                  System.out.println("enter the new count ");
                  int cnt = sc.nextInt();
                  System.out.println("enter the new cost ");
                  int cst = sc.nextInt();
                  System.out.println("enter the specifications ");
                  String sp = sc.next();
                  add(ids, count, cost, specs, id, cnt, cst, sp);
            }
            else if(n==6){
                  System.out.println("enter the id");
                  int id = sc.nextInt();
                  delete(id, ids, count, cost, specs);
            }
            else if(n==7){
                  again =0;
            }

      }
      // add(ids, count, cost, specs,  1 , 7, 1000, "s1");
      // add(ids, count, cost, specs,  2 , 9, 2000, "s2");
      // edit(2, 7, 1200, ids, count, cost, specs);
      // display(ids, count, cost, specs);
     sc.close();
}
      public static void add(int[]ids,int[]count,int[]cost,String[]specs,int id,int cnt,int cst,String spec){
          
          if(i==ids.length-1){
            System.out.println("cant possible ");
            return;
          }
          ids[i]=id;
          count[i]=cnt;
          cost[i] = cst;
          specs[i] = spec;
          System.out.println("added at "+i);
          i++;
      }
      public static void edit(int id,int ncount,int ncost,int[] ids,int[]count,int[]cost,String[]specs){
            for(int j=0;j<=i;j++){
                  if(ids[j]==id){
                        count[j] = ncount;
                        cost[j] = ncost;
                  }
            }
      }
      public static void delete(int id,int[] ids,int[]count,int[]cost,String[]specs){
             for(int j=0;j<ids.length;j++){
                  if(ids[j]==id){
                        count[j] = 0;
                        cost[j] = 0;
                        specs[j]="";
                  }
             }
             i--;
            System.out.println("record deleted");
      }
      public static void display(int[] ids,int[]count,int[]cost,String[]specs){
            System.out.println("id         count        cost         specifications");
            for(int j=0;j<=i;j++){
            System.out.println(ids[j]+"         "+count[j]+"             "+cost[j]+"         "+specs[j]);
            }
      }
      public static void get_details(int id,int[]ids,int[]count,int[]cost,String[]specs){
             for(int j=0;j<i;j++){
                  if(ids[j]==id){
                        System.out.println("the product with this id has ");
                        System.out.println("count: "+count[j]);
                        System.out.println("cost: "+cost[j]);
                        System.out.println("specs :"+specs[j]);
                  }
             }
      }
      
}