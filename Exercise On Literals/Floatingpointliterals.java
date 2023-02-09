/* Java program to illustrate the application of floating-point literals */

/* For Floating-point data types, we can specify literals in only decimal form, 
   and we cant specify in octal and Hexadecimal forms.  */

public class Floatingpointliterals {

    public static void main(String[] args) {
        
        // decimal-form literal
        float a =  101.230f;
          // It also acts as decimal literal
        float b =  0123.222f;
          // Hexa-decimal form (error)
        //float c = 0x123.222;
       
        System.out.println(a);
        System.out.println(b);
       // System.out.println(c);
       
    }
    
}
