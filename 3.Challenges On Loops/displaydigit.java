import java.util.Scanner;

public class displaydigit {

    public static void main(String[] args) {
        
        //Taking Input from user

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : "); 
        int num = sc.nextInt();

        //Using while loop

        System.out.println("The digits of Number is : ");

        while(num > 0){

            //taking out reminder/last digit from number

           int digit = num % 10;

            System.out.print(" "); //Printing Space between digits

            //Printing last digit

           System.out.print(digit);

           //Removing the last digit by dividing it to 10

           num = num/10;
        }
    }
    
}
