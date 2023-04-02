import java.util.*;
public class Question8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num1: ");
        int a=sc.nextInt();        
        System.out.println("Enter num2: ");
        int b=sc.nextInt();        
        System.out.println("Enter num3: ");
        int c=sc.nextInt();
        System.out.println("The Smallest Number: "+Math.min(Math.min(a,b),c));
        System.out.println("The Largest Number: "+Math.max(Math.max(a,b),c));
        System.out.println("Average of all Three  Numbers: "+(a+b+c)/3);
        sc.close();
    }
}
