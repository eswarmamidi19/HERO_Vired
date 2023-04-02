import java.util.*;
public class Question9 {
    public static boolean  isprime(int n)
    {
        if(n==1) return false;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the Number: ");
        int n=sc.nextInt();
        if(isprime(n))
            System.out.println("The given number "+n+" is a prime Number");
        else
            System.out.println("The given number "+n+" is not a prime Number");
       sc.close();
    }
        
}
