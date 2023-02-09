
/* Java programs to use all the arithmetic operators */

import java.util.Scanner;

public class ArithimaticOperators {

    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double N1 = sc.nextDouble();
 
        System.out.print("Enter the second number: ");
        double N2 = sc.nextDouble();
 
        double Sum = N1 + N2;
        double Difference = N1 - N2;
        double Product = N1 * N2;
        double Quotient = N1 / N2;
 
        System.out.println("The Sum of the two numbers is: " + Sum);
        System.out.println("The Difference of the two numbers is: " + Difference);
        System.out.println("The Product of the two numbers is: " + Product);
        System.out.println("The Quotient of the two numbers is: " + Quotient);
    }
    
}
