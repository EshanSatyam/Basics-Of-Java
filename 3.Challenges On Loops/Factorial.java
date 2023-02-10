import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        

        /* Factorial of n is the product of all positive descending integers. 
           Factorial of n is denoted by n!. 
           4! = 4*3*2*1 = 24 */

           //Taking Input from user

           Scanner sc = new Scanner(System.in);
           
           System.out.println("Enter a Number : ");
           int num = sc.nextInt();
           int fact = 1;
           //Using for loop

           for(int i = 1; i <= num; i++){
                 
            fact = fact*i;

           }

           System.out.println("Factorial of " + num + " is " + fact);

    }
}