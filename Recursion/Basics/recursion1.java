import java.util.*;
public class recursion1 {

    public static void print_recursion(int n){
        if(n==1){
            System.out.println("I love u Riha");
            return;
        }
        System.out.println(100 - n + ", I love u Riha, my queen");
        print_recursion(n-1);

    }
    public static void main(String args[]){
        print_recursion(100);
    };
}