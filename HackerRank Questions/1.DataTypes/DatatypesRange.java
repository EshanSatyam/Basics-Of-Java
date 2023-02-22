
/* Java has 8 primitive data types; char, boolean, byte, short, int, long, float, and double.
 For this exercise, we'll work with the primitives used to hold integer values
  (byte, short, int, and long):

A byte is an 8-bit signed integer.
A short is a 16-bit signed integer.
An int is a 32-bit signed integer.
A long is a 64-bit signed integer.
Given an input integer, you must determine which primitive data types are capable of properly storing
 that input. */

 import java.util.Scanner;

public class DatatypesRange {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number to Check Range: ");
        double x = sc.nextDouble();
        String a = "Number is fitted in - ";

        //Using if else-if conditions

        if(x>=-128 && x<=127){
            
            System.out.println(a);
            System.out.println("byte");
        }
        else if(x>= -32768 && x<= 32767){

            System.out.println(a);
            System.out.println("byte");
            System.out.println("short");
        }
        else if(x>= -2147483648 && x<= 2147483647){

            System.out.println(a);
            System.out.println("byte");
            System.out.println("short");
            System.out.println("int");
        }
        else if(x>= -9223372036854775808L && x<= 9223372036854775807L){

            System.out.println(a);
            System.out.println("byte");
            System.out.println("short");
            System.out.println("int");
            System.out.println("long");
        }
        else{

            System.out.println(x + "can't be fitted anywhere");

        }
        

    }
    
}
