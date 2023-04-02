import java.util.Scanner;

/**
 * Question1
 */
public class Question1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the which multiplication table You want ");
        int n = sc.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(n+" "+"X"+" "+i+" = "+n*i);
        }
        sc.close();
    }
}