
/*Java programs to practice Increment/Decrement operators.*/

public class IncrementDecrement {

    public static void main(String[] args) {
        

        //Increment operators

        int i = 56;
        System.out.println(i++); //First Assigning than incrementing
        System.out.println(i);
        System.out.println(++i); //First incrementing than assigning
       

        //Decrement operators

        int j = 34;
        System.out.println(j--); //First Assigning than decrementing
        System.out.println(j);
        System.out.println(--j); //First Decrementing than assigning
        



        int y = 7;
        int x = ++y*8;
        System.out.println(x);

        //Increment & Decrement also works on characters

        char ch = 'a';
        System.out.println(++ch);
    }
    
}
