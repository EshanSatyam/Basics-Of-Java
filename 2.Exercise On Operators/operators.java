/* Java Program will illustrate the working of Modulo, Comparison,
   Logical, and Bitwise Operators */

public class operators {

    public static void main(String[] args) {
        
         //Operators

         int a = 4;
         int b=6 +a;
 
         System.out.println(b);
 
         int c = 4;
         int d = 6 % a; // Modulo Operators
 
         System.out.println(d);
 
         int e = 4;
         e += 3;
 
         System.out.println(e);
 
         /* The equality and relational operators determine if one operand
          is greater than, less than, equal to, or not equal to another operand.  */

         System.out.println(6==8);
         System.out.println(6==6);
         System.out.println(6>2);
         System.out.println(9<8); //Comparison Operators
 
 
         /* The && and || operators perform Conditional-AND and Conditional-OR operations
          on two boolean expressions. These operators exhibit "short-circuiting" behavior,
           which means that the second operand is evaluated only if needed. */

         System.out.println(64>5 && 64>8);
         System.out.println(64<9 && 64>3);
         System.out.println(4>2 || 4<3); //Logical Operators
 
         /* A bitwise operator is an operator used to perform bitwise operations on bit patterns
          or binary numerals that involve the manipulation of individual bits. */
         
         System.out.println(2&3); //bitwise operators
 
    }
    
}
