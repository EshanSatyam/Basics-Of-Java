
/* Write a program to calculate the sum of the digits of a 3-digit number.
Number : 132        Output : 6 */

import java.util.Scanner;

public class H_1_SumOfOutput {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        int sum = 0;
        int digit = 0;

        while(num>0){

            digit = num%10;   //Taking out the digit
            sum = sum + digit; //Adding it to sum

            num = num/10; //Removing the last digit
        }

        System.out.println("Sum of digit : " + sum);
    }
}
