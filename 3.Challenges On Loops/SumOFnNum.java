import java.util.Scanner;

public class SumOFnNum {

    public static void main(String[] args) {
        
        //Taking Input From User

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number : ");
        double n = sc.nextDouble();

        //Using For Loop

        double sum = 0;
        int i;
        for( i = 1; i<=n; ++i){

            sum = sum + i;
            
        }

        System.out.println("Sum till n number is : " + sum); 
    }
    
}
