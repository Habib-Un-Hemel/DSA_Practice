import java.util.*;
public class printing_numbers {

    public static void print_num_recursion(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.print(n+" ");
        print_num_recursion(n-1);
    }


    public static void print_num_recursion_increasing(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
    
        print_num_recursion_increasing(n-1);
        System.out.println(n);
    }
    public static void main(String args[]){
        int n =10;
        print_num_recursion(n);
        print_num_recursion_increasing(n);
    }
}
