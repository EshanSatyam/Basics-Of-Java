import java.util.Scanner;

/* Given an integer,N, print its first 10 multiples. Each multiple N*i (where 1 <= i <= 10) 
   should be printed on a new line in the form: N x i = result. */

public class multiple {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Integer : ");
        int N = sc.nextInt();

        for(int i = 1; i<=10; i++){

            int result = N*i;

            System.out.println(N + " * " + i + " " + " = " + result);
        }

    }
}
