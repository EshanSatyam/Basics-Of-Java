import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int reverse = 0;

        int temp = num;
        while(num > 0){

            int reminder = num % 10;

            reverse = reverse*10 + reminder;
            num = num/10;
        }

        System.out.print("The reverse of number is : ");
        System.out.println(reverse);

        if(reverse == temp){

            System.out.println("Number is a palindrom");
        }else{

        System.out.println("Number is not palindrom");

        }
        
    }
}
