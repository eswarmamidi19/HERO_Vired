import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("Select an operation from below :");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Percentage");
            System.out.println("6. Factorial");
            System.out.println("7. Square");
            System.out.println("8. Cube");
            System.out.println("9. Square Root");
            System.out.println("10. a Power b");
            System.out.println("11. a Root b");
            System.out.println("12. Exit");
            System.out.println("Enter the choice: ");
            int ch=sc.nextInt();
            if(ch==1)
            {
                System.out.println("Enter number 1: ");
                double num1=sc.nextDouble();
                System.out.println("Enter number 2: ");
                double num2 =sc.nextDouble();
                System.out.println("Addition of "+num1+" and "+num2 +" = "+(num1+num2 ));
            }
            else if(ch==2)
            {
                System.out.println("Enter number 1: ");
                double num1=sc.nextDouble();
                System.out.println("Enter number 2: ");
                double num2 =sc.nextDouble();
                System.out.println("Substraction of "+num1+" and "+num2 +" = "+(num1-num2 ));
            }
            else if(ch==3)
            {
                System.out.println("Enter number 1: ");
                double num1=sc.nextDouble();
                System.out.println("Enter number 2: ");
                double num2 =sc.nextDouble();
                System.out.println("Multiplication of "+num1+" and "+num2 +" = "+(num1*num2 ));
            }
            else if(ch==4)
            {
                System.out.println("Enter number 1: ");
                double num1=sc.nextDouble();
                System.out.println("Enter number 2: ");
                double num2 =sc.nextDouble();
                if(num1!=0 && num2 !=0)
                    System.out.println("Divison of "+num1+" and "+num2 +" = "+(num1/num2 ));
                else
                    System.out.println("Not Possible / By Zero");
            }
            else if(ch==5)
            {
                System.out.println("Enter number 1: ");
                double num1=sc.nextDouble();
                System.out.println("Enter number 2: ");
                double num2 =sc.nextDouble();
                if(num1!=0 && num2 !=0)
                    System.out.println("Percentage of "+num1+" and "+num2 +" = "+(num1%num2 ));
                else
                    System.out.println(" / By Zero");
            }
            else if(ch==6)
            {
                System.out.println("Enter num: ");
                double n=sc.nextDouble();
                int fact=1;
                for(int i=1;i<=n;i++)
                    fact*=i;
                System.out.println("Factorial of"+n+" = "+fact);
            }
            else if(ch==7)
            {
                System.out.println("Enter num: ");
                double n=sc.nextDouble();
                System.out.println("Square of"+n+" = "+n*n);
            }
            else if(ch==8)
            {
                System.out.println("Enter num: ");
                double n=sc.nextDouble();
                System.out.println("Cube of"+n+" = "+n*n*n);
            }
            else if(ch==9)
            {
                System.out.println("Enter num: ");
                double n=sc.nextDouble();
                System.out.println("Square Root of"+n+" = "+Math.sqrt(n));
            }
            else if(ch==10)
            {
                System.out.println("Enter a: ");
                double a=sc.nextDouble();
                System.out.println("Enter b: ");
                double b=sc.nextDouble();
                System.out.println(a+" Power "+b+" = "+Math.pow(a,b));
            }
            else if(ch==11)
            {
                System.out.println("Enter num: ");
                double a=sc.nextDouble();
                System.out.println("Enter root value: ");
                double b=sc.nextDouble();
                System.out.println(a+" Root "+b+" = "+Math.pow(a,1.0/b));
            }
            else if(ch==12) break;
        }
        sc.close();
    }
}