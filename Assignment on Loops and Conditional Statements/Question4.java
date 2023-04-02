import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){

            System.out.println("Menu based app - Even/Odd Checker");
            System.out.println("Enter the number = ");
            int n=sc.nextInt();
            if(n%2==0)
                System.out.println("The given Number "+n+" is a Even Number");
            else
                System.out.println("The given Number "+n+" is a Odd Number");
            System.out.println("Do You want To Continue: Y/N ");
            String c = sc.next();
            if(c.charAt(0)=='n'|| c.charAt(0)=='N') break;
        }
        sc.close();
    }
}
