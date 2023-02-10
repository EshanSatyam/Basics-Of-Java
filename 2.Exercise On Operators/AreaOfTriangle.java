
/* Program to find out the area of a triangle.
 Take base and height as input (use scanner class for taking input).  */

 import java.util.Scanner;

public class AreaOfTriangle {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //Area of Triangle = 1/2*base*height

        //Taking Input From User
        System.out.println("Calculating area of Triangle -");
        System.out.println("Enter the value of base : ");
        float base = sc.nextFloat();
        System.out.println("Enter the value of height : ");
        float height = sc.nextFloat();

        //Doing Arithimatic operation 

       float area = (base*height)/2;

        //Taking output 

        System.out.println("Area of Traingle is : " + area);
    }
    
}
