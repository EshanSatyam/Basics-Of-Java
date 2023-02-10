
/* Program to print Multiplication Table */

import java.util.Scanner;

public class MultiplicationTable {
    
    public static void main(String[] args) {
        
        // number n for which we have to print the  
        // multiplication table.  

        Scanner sc = new Scanner(System.in);

        //Taking input from user

        System.out.println("Enter a Number for Printing Table : ");
        int num = sc.nextInt();

        //Enter range of table

        System.out.println("Enter Range : ");
        int range = sc.nextInt();


        //Using While Loop

        System.out.println("Printing table using While Loop");
        int i = 1;
        while(i <= range){

            System.out.println(num + "*" + i + "=" + num*i);

            //increment the value by 1
            i++;
        }

        //Using For Loop

        System.out.println("Printing table using For Loop");
        int j;

        for(j=1; j<=range; j++){

            System.out.println(num + "*" + j + "=" + num*j);
        }

    }
}
