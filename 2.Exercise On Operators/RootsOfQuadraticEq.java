import java.util.Scanner;

/* program to find out the roots of a quadratic equation.For Equation 𝑎𝑥^2+𝑏𝑥+𝑐=0  
   find the roots 𝑥=(−𝑏±√(𝑏^2−4𝑎𝑐))/2𝑎 
   take a, b, and c as input from user (use scanner class for taking input). */

public class RootsOfQuadraticEq {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Quadratic Equation - f(x) = ax2 + bx + c = 0 where a, b, c, ∈ R and a ≠ 0

        /* The term b2-4ac is known as the determinant of a quadratic equation. 
          It specifies the nature of roots. That is,

          if determinant > 0, roots are real and different
          if determinant == 0, roots are real and equal
          if determinant < 0, roots are complex complex and different */

        //Taking Inputs from User

        System.out.println("Finding the roots of Quadratic Equation");
        System.out.println("Enter the value of a : ");
        double a = sc.nextDouble();
        System.out.println("Enter the value of b : ");
        double b = sc.nextDouble();
        System.out.println("Enter the value of c : ");
        double c = sc.nextDouble();


        double root1, root2;

        //First determing the determinant of Equation

        double determinant = (b*b - 4*a*c);

        //Making conditions
        //checking if determinant is greater than 0

        if(determinant > 0){
            
            //two real and distinct root

            root1 = (-b + Math.sqrt(determinant))/ (2*a);
            root2 = (-b - Math.sqrt(determinant))/ (2*a);

            System.out.format("First root is %.2f", root1);
            System.out.format("Second root is %.2f", root2);

        }

        //checking if determinant is equal to 0

        else if (determinant == 0) {

            // two real and equal roots
            // so -b + 0 == -b
            root1 = root2 = -b / (2 * a);
            System.out.format("root1 = root2 = %.2f;", root1);
          }



          //checking if determinant is less than zero
        else {

        // roots are complex number and distinct
        double real = -b / (2 * a);
        double imaginary = Math.sqrt(-determinant) / (2 * a);
        System.out.format("root1 = %.2f+%.2fi", real, imaginary);
        System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
      }

    }
    
}
