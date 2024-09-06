package Conditional_statements;
import java.util.*;
public class odd_even {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num%2==0){
            System.out.print("number is even");
        }else{
            System.out.print("number is odd");
        }
    }
}
