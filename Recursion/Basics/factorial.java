// import java.util.*;
// public class factorial {

//     public static int factorial_recursion(int n){
//         if (n==0){
//             return 1;
//         }
//         return n * factorial_recursion(n-1);
//     }
//     public static void main(String args[]){
//         System.out.println(factorial_recursion(5));
//     }
// }

//done by alpha batch
import java.util.*;
public class factorial {

    public static int factorial_recursion(int n){
        if (n==0){
            return 1;
        }
        int fm1 =  factorial_recursion(n-1);
        int fn = n * fm1;
        return fn;
    }
    public static void main(String args[]){
        System.out.println(factorial_recursion(5));
    }
}
