import java.util.*;
public class recursion1 {

    public static void print_recursion(int n){
        if(n==1){
            System.out.println("I love coding");
            return;
        }
        System.out.println("I love coding");
        print_recursion(n-1);

    }
    public static void main(String args[]){
        print_recursion(5);
    };
}
