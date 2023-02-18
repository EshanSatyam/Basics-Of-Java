import java.util.Scanner;

public class pattern {
    
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        int i;
        int j;
        System.out.println("Enter the number");
        int n = sc.nextInt();

        //FOR ROWS i FOR COLUMNS j
        for( i = 1; i<=n; i++){

            for(j = 1; j<=i; j++){
                System.out.print(" * ");
            }

            System.out.println("  ");
        }

       }
    }

