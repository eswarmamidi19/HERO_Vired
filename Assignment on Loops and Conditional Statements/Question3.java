import java.util.Scanner;

public class Question3 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter a ");
         int a =sc.nextInt();
         System.out.println("enter b");
         int b= sc.nextInt();
         sc.close();
         System.out.println("before swapped a= "+a+"  b= "+b);
         int temp;
         temp=a;
         a=b;
         b=temp;
         System.out.println("after swapped a= "+a+"  b= "+b);
     }
}
