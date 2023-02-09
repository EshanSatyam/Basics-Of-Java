
/* Java Program will illustrate the Associativity of operators */

public class Associativity {

    public static void main(String[] args) {

        /*   Highest precedence goes to * and /. They are then evaluated 
         on the basis of left to right associativity */
        
        int a = 6*5-34/2;
    
      /* 
           6*5-34/2
           30-34/2
           30-17
           13
     */
        System.out.println(a);


        int b = 60/5-34*2;
        
        /*
            60/5-34*2
            12-34*2
            12-68
            -56
         */

        System.out.println(b);

    }
    
}
