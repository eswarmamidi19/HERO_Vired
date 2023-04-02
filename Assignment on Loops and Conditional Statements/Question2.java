import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Marks Obtained by a Student:  ");
        double marks = sc.nextDouble();
        System.out.println("Marks in total :  ");
        double total_marks = sc.nextDouble();
        double percent = marks/total_marks *100;
        System.out.printf("percentage :  %.2f \n",percent);
        char grade='a';
        double gpa=0;
        if(0>=percent && percent<=59){
            gpa=0.0;
            grade='F';
        }
        else if(60>=percent && percent<=69){
            gpa=1.0;
            grade='D';
        }
        else if(70>=percent && percent<=79){
            gpa=2.0;
            grade='C';
        }
        else if(80>=percent && percent<=89){
            gpa=3.0;
            grade='B';
        }
        else if(90>=percent && percent<=100){
            gpa=4.0;
            grade='A';
        }
        
        System.out.println("Grade  = "+grade+" ,GPA = "+gpa);
        sc.close();
    }
}
