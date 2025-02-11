package BitManipulation;

public class b_swapTwoNumbers {
    public static void main(String[] args) {

    int a = 10;
    int b = 20;

    a= a^b; 
    b = a^b;   //(a^b)^b -> a
    a = a ^ b  ; //(a^b) ^a



    
    // System.out.println("A: "+ a);
    // System.out.println("B: "+b);
    // int temp= a;
    // a = b;
    // b = temp; 
    System.out.println("A: "+ a);
    System.out.println("B: "+b); 


    }


}


