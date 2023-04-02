import java.util.Scanner;

public class Question5 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
          while (true) {
            System.out.println("    1.CM to M");
            System.out.println("    2.M to KM");
            System.out.println("    3.KM to M");
            System.out.println("    4.M to CM");
            System.out.println("enter any of the options ");
            int n = sc.nextInt();
            if(n==1){
                System.out.println("Please enter the CM Value");
                double cm = sc.nextDouble();
                System.out.println(cm+"CM"+" = "+ (double)cm/100+"M");
            }
            else if(n==2){
                System.out.println("Please enter the M Value");
                double m = sc.nextDouble();
                System.out.println(m+"M"+" = "+ (double)m/1000+"KM");
            }
            else if(n==3){
                System.out.println("Please enter the KM Value");
                double km = sc.nextDouble();
                System.out.println(km+"kM"+" = "+ (double)km*1000+"M");
            }
            else if(n==4){
                System.out.println("Please enter the M Value");
                double m = sc.nextDouble();
                System.out.println(m+"M"+" = "+ (double)m*100+"CM");
            }
            System.out.println("do you want to continue ");
            String c = sc.next();
            if(c.equals("n")){
                break;
            }
          }
         sc.close();
     }
}
