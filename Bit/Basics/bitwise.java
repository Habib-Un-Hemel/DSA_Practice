

public class bitwise{
    public static void main(String args[]){
        //bit AND
        System.out.println(5&6); 

        //bit OR
        System.out.println(0|1);
        
        // Bit XOR
        //Not of 0 = 1 ? but in computer 0 = 00000000 which first 1s complement =1111111 as it gives a negative number so now i will check which negative number it is
        System.out.println(~0);

        //Binary left shift 
        //formula a<<b = a * 2^b
        System.out.println(5<<2);

        //Binary Right Shift 
        // a>>b = a / 2^b
        System.out.println(5>>2);
    }



}
