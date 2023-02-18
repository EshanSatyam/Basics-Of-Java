import java.util.Scanner;

/* Write a Java program that takes two numbers as input and display the product of two numbers.*/

public class T1_Q6_PrintProduct {

    public static void main(String[] args) {
        
        System.out.println("Enter two Numbers : ");
        
        //Taking Input

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Numbers");
        int a = sc.nextInt();

        System.out.println("Enter Second Number :");
        int b = sc.nextInt();


        //Product of two Number

        int c = (a*b);

        System.out.println("Product of Two Number is : " + c);
    }
    
}
