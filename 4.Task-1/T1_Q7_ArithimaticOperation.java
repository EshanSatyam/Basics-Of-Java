import java.util.Scanner;

/* Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.*/

public class T1_Q7_ArithimaticOperation {

    public static void main(String[] args) {
        
        //Taking Input

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Numbers to perform different arithimatic operations-");
        System.out.print("Enter the First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter the Second Number : ");
        int b = sc.nextInt();

        //Sum of Numbers
        int c = (a+b);

        //Multiplication of Numbers
        int d = a*b;

        //Subtraction of Numbers
        int e = a-b;

        //Dividing of Numbers
        int f = a/b;

        //Remainder of Numbers
        int g = a%b;


        System.out.println("Sum of Two Numbers is : " + c);
        System.out.println("Multiplication of Two Numbers is : " + d);
        System.out.println("Substraction of Two Numbers is : " + e);
        System.out.println("Divide of Two Numbers is : " + f);
        System.out.println("Remainder of Two Numbers is : " + g);
    }
    
}
