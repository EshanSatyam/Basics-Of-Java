import java.util.Scanner;

/* Write a Java program that takes three numbers as input to calculate and print the average of the numbers.*/

public class T1_Q8_PrintAverage {
    
    public static void main(String[] args) {

         //Taking Inputs
         Scanner sc = new Scanner(System.in);

         System.out.println("Enter three Numbers to calculate average : ");
         System.out.print("Enter First Number : ");
         int a = sc.nextInt();
         System.out.print("Enter Second Number : ");
         int b = sc.nextInt();
         System.out.print("Enter Third Number : ");
         int c = sc.nextInt();

         //Taking Average

         int d = (a+b+c)/3 ;

         System.out.println("Average of given Number is : " + d);
        
    }
}
