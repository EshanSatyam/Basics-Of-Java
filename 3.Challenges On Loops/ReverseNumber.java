
/* Java program to reverse a Number */

import java.util.Scanner;

public class ReverseNumber {
    
    public static void main(String[] args) {


        //Taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        //Using While Loop

        int reverse = 0;
        while(num != 0){
        
             int reminder = num % 10;  //Taking the last digit of number
             reverse = reverse*10 + reminder;
             num = num / 10;  //Removing the last digit

        }
        
        System.out.println("Number in reverse order is : " + reverse);

    }
}
