import java.util.Scanner;

public class Question10 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" stringName : ");
        String str = sc.nextLine();
        System.out.println("Starting index:  ");
        int si = sc.nextInt();
        System.out.println("Ending Index:  ");
        int ei = sc.nextInt();
        System.out.println("subString of "+str +" from "+si+"  "+ei+"  is : "+str.substring(si,ei+1));
        sc.close();
    }
}
