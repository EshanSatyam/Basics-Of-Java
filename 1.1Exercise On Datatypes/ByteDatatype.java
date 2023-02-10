//Java Program to demonstrate Byte Data Type

public class ByteDatatype {

    public static void main(String[] args) {
        
        //Initialization
        byte a = 126;

        //byte is 8 bit value
        System.out.println(a);

        a++; //Incrementing the value of a

        System.out.println(a);


        a++; //Incrementing the value of a


        // It overflows here because
        // byte can hold values from -128 to 127
        System.out.println(a);

        a++; // Incrementing the value of a

        // Looping back within the range
        System.out.println(a);

    }
    
}
