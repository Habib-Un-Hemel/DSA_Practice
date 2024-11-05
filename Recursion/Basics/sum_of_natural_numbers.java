import java.util.*;
public class sum_of_natural_numbers {

    public static int sum_of_num(int n){
        if(n==1){
            return 1;
        }
        return  n + sum_of_num(n-1);

    }
    public static void main(String args[]){
        System.out.println(sum_of_num(4));
    };
}